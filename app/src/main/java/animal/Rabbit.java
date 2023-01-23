package animal;

/**
 * @author mashirocl@gmail.com
 * @since 2023/01/23 12:55
 */
public class Rabbit extends Animal{
    private String name = "Rabbit";
    private String sound = "RabiRabi";

    public void eat(){
        System.out.println("Eating");
    }

    public void drink(){
        System.out.println("Drinking");
    }
}
