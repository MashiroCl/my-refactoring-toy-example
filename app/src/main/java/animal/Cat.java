package animal;

/**
 * @author mashirocl@gmail.com
 * @since 2023/01/23 12:49
 */
public class Cat extends Animal{
    private String name = "Cat";
    private String sound = "Meow";

    public void sleep(){
        System.out.println("Sleeping");
    }



    public void playWith(Dog targetAnimal){
        System.out.println("Playing with "+targetAnimal.getClass().getName());
    }
}
