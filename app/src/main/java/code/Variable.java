package code;

import java.util.Random;

/**
 * @author mashirocl@gmail.com
 * @since 2024/02/06 9:56
 */
public class Variable {

    public void replaceExpressionWithVariable(){
        int a = Foo.getInteger();
        System.out.println(a);
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
