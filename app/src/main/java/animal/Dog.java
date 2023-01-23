package animal;

/**
 * @author mashirocl@gmail.com
 * @since 2023/01/23 12:46
 */
public class Dog extends Animal{
    private String name = "Dog";
    private String sound = "Woof";

    public void play(){
        System.out.println("Playing");
    }

    public void eat(){
        System.out.println("Eating");
    }

}
