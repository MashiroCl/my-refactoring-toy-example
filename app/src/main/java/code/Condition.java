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

            System.out.println("Then part of the 1st if");
        }
        else{
            a=a-b;
            System.out.println("Else part of the 1st if");
        }

        if(flag2){
            a=a+b;
            a=a*b;
            System.out.println("Then part of the 2nd if");
        }
        else{
            a=a/b;
            System.out.println("Else part of the 2nd if");
        }


    }

    public void moveOutIf(){
        boolean flag = true;
        int a=1;
        int b=2;
        int res=0;
        if(flag){

            res = res*a;
        }else{
            res = res+a;
            res = res+b;
            res = res-a;
            res = res-b;
            res = res/a;
        }

        System.out.println(res);
    }

    public void moveFromOutSideToIf(){
        boolean flag = true;
        int a=1;
        int b=2;
        if(flag){
            return;
        }
        a= a+b;
        b= b-1;
    }

    public void extendIfElse(){
        boolean flag = true;
        int a=1;
        int b=2;
        if(b==2){
            System.out.println("flag is true");
        }else if(a==1){
            System.out.println("flag is false and a==1");
        }
        else {
            System.out.println("flag is false and a!=1");
        }

    }

    public boolean conditionalToBooleanReturn(){
        int a=1;
        int b=2;
        return a+b==3;
    }

    public void conditionalToSwitch(){
        int a = 1;
        switch (a){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("is not 1 or 2 or 3");
        }
    }

    public void reverseConditional(){
        boolean flag = true;
        int a=1;
        int b=2;
        if(flag!=true){
            System.out.println("flag is true");
        }
        if(!flag){
            System.out.println("flag is true without equal symbol");
        }
        if(b<=a){
            System.out.println("b>a");
        }
        if(a<=b){
            System.out.println("b<a");
        }
    }

    public int convertIfToTernaryOperator(){
        int a = 1;
        int b = 2;
        return a>b?a:b;
    }

    public void removeRedudantElse(){
        boolean flag = true;
        if(!flag){
            System.out.println("this is else");
        }
    }

    public void removeRedudantElse2(){
        boolean flag = true;
        if(flag){
            System.out.println("this is then");
        }else {
            System.out.println("this is else");
        }
    }
}