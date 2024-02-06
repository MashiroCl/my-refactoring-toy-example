package code;

import java.util.Random;

/**
 * @author mashirocl@gmail.com
 * @since 2024/02/06 9:56
 */
public class Variable {

    public void replaceExpressionWithVariable(){
        int a = Foo.getInteger();
        if(getRandomInteger()+a<100){
            a += 1;
        }
        System.out.println(Foo.getInteger());
    }

    public int getRandomInteger(){
        return new Random().nextInt();
    }
}

class Foo{
    public static int getInteger(){
        return 1;
    }
}
