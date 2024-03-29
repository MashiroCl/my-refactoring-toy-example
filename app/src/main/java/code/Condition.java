package code;

import java.sql.SQLOutput;

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
        }
    }

    public void unifyCondition(){
        String word = "miaomiaomiao";
        if(word.startsWith("miao") || word.startsWith("nya")){
            System.out.println("I think there is a cat");
        }
        else if(word.startsWith("bark")){
            System.out.println("I think there is a dog");
        }
    }

    public void deleteConditionals(){
        boolean flag = true;
        if(flag){
            System.out.println("a");
        }
        System.out.println("b");



        System.out.println("c");
    }

    public void parallelCondition(){
        boolean flag = true;
        int a=1;
        int b=2;
        if(flag && a==1){
            if(b==2)
            System.out.println("all true");
        }
        // logic changed
        if(flag || b==2){
            if(a==1)
            System.out.println("any true");
        }

        if(flag || b==2){
            if(a==1)
            System.out.println("some true");
        }
    }

    public void parallelCondition2(){
        boolean flag = true;
        int a=1;
        int b=2;
        if(flag && a==1){
            if(b==2)
                System.out.println("all true");
        }
    }
    static class Body{
        public boolean b=true;
        public boolean c=false;

        public boolean getB(){
            return b;
        }
        public boolean getC(){
            return c;
        }
    }

    public void reverseCondition3(){
        Body body = new Body();
        if(!body.getC()){
            System.out.println("this is true");
        }

    }

    public void reverseThenElse(){
        boolean flag = true;
        if(!flag){
            System.out.println("flag is false");
        }
        else{
            System.out.println("flag is true");
        }
    }

    public void changeBoundaryCondition(){
        int a=2;
        int b=3;
        if(a<=b){
            System.out.println("this is a change boundary condition");
        }
    }

    public void reverseCondition4(){
        boolean flag = true;
        if(!flag){
            System.out.println("flag is true");
        }
        else {
            System.out.println("flag is false");
        }
    }

    public void reverseCondition5(){
        Body body = new Body();
        if(body.getC()){
            System.out.println("this is true");
        }
        else {
            System.out.println("this is false");
        }
    }

    public void changeCaller(){
        Body body1 = new Body();
        Body body2  = new Body();
        if(body2.getB()){
            System.out.println("true");
        }

    }

    public static boolean getTrue(){
        return true;
    }

    public static boolean getFalse(){
        return false;
    }

    public void changeCaller2(){
        if(getFalse()){
            System.out.println("true");
        }
    }

    public void AddAdditionalCondition(){
        int a = 1;
        boolean b = false;
        int c = 2;
        if(a==1 && b){
            System.out.println("this is a");
        }

        if(b || c==2){
            System.out.println("this is b");
        }
    }


    public void SimplifyConditional(){
        int a = 1;
        boolean b = false;
        int c = 2;
        if(b){
            System.out.println("this is a");
        }

        if(c==2){
            System.out.println("this is b");
        }
    }

    public boolean addCurlyBrace1(){
        boolean flag = true;
        if(flag) return false;

        return true;
    }

    public void addCurlyBrace2(){
        boolean flag = true;
        if(flag)
            System.out.println("this is the statement");

    }

    public void lowerCondition(){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if(a & !b){
            System.out.println("in the lower logical level");{
                if(c){
                    System.out.println("in the higher logical level");
                }
            }
        }

    }

    public void changeLogicOperator(){
        int a = 1;
        int b = 2;
        if(a==1 && b==2){
            System.out.println("this is great");
        }
    }
}