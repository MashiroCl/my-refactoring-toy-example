package code;

/**
 * @author mashirocl@gmail.com
 * @since 2024/01/01 18:31
 */
public class Condition {

    public void inverseIfElseCondition(){
        boolean flag = true;
        int a=3, b=2;
        int res = 0;
        if(!flag){
            return;
        }

        res = a+b;
        res = res*a;
        res = res*b;

        System.out.println(res);
    }

    public void inverseIfElseCondition2(){
        boolean flag = true;
        int a=3, b=2;
        int res = 0;
        if(flag){
            res = a+b;
            res = res*a;
            res = res*b;
        }
        else{
            res = a-b;
            res = res/a;
            res = res/b;
        }
        System.out.println(res);
    }


}
