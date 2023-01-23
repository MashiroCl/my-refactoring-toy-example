package animal;

/**
 * @author mashirocl@gmail.com
 * @since 2023/01/23 12:45
 */
public abstract class Animal {
    private String name;
    private String sound;
    public void bark(){
        System.out.println(sound);
    }
}
