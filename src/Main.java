import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create a new Recipe object
        Recipe recipe = new Recipe("Pancakes", 4, List.of("Flour", "Eggs", "Milk", "Sugar", "Baking Powder"));

        // Print the recipe details
        System.out.println("Recipe Name: " + recipe.name);
        System.out.println("Servings: " + recipe.servings);
        System.out.println("Ingredients: " + String.join(", ", recipe.ingredients));
    }
}
