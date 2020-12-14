import java.util.HashSet;
import java.util.Set;

public class IngredientsSet {
    public static void main(String[] args) {
        Set<String> ingredients = new HashSet<>();

        ingredients.add("Sugar");
        ingredients.add("Milk");
        ingredients.add("Chocolate");
        ingredients.add("Vanilla");

        // Remove from set
        ingredients.remove("Milk");

        // Replace in set
        ingredients.add("Butter");

        System.out.println("Here is a list of your ingredients: ");
        for (String ingredient:ingredients) {
            System.out.println(ingredient);
        }
    }
}
