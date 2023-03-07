package food;

import java.util.List;

/**
 * @author mashirocl@gmail.com
 * @since 2023/03/07 14:07
 */
public class Ramen {
    public String name = "Ramen";

    public List<String> getRecipe(){
        return List.of("recipe1","recipe2");
    }
}
