package code;

/**
 * @author mashirocl@gmail.com
 * @since 2024/02/13 12:01
 */
public class Pattern {
    public void change(){
        int a = 1;
        int b = 2;
        int c = a+b;
        assertEquals(a, 1);
        System.out.println(c);
    }
}
