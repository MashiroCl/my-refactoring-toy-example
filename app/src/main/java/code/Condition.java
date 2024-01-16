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
        if(!flag){
            res = a-b;
            res = res/a;
            res = res/b;
        }
        else{
            res = a+b;
            res = res*a;
            res = res*b;
        }
        System.out.println(res);
    }


    public void moveBlockToIf(){
        boolean flag = true;
        int a=3, b=2;
        int res = 0;

        if(!flag){
           res = a+b;
            res = a-b;
            res = res/a;
            res = res/b;
        }
        else{
            res = a+b;
            res = res*a;
            res = res*b;
        }
        System.out.println(res);

    }

    public void changeIfCondition(){
        int a =1,b=2;
        boolean flag = true;
        if(flag){
            System.out.println(a);
            System.out.println(b);
        }
    }

    public void twoIfs(){
        boolean flag1 = true;
        boolean flag2 = false;
        int a=1;
        int b=2;
        if(flag1){
            a=a+b;
            System.out.println("Then part of the 1st if");
        }
        else{
            a=a-b;
            System.out.println("Else part of the 1st if");
        }

        if(flag2){
            a=a*b;
            System.out.println("Then part of the 2nd if");
        }
        else{
            a=a/b;
            System.out.println("Else part of the 2nd if");
        }


    }


}
