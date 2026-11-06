import java.util.List;

public class Main {

    void main() {
        Recipe recipe = new Recipe("Pancakes", 4, List.of("Flour", "Eggs", "Milk", "Sugar"));

        recipe.name = "Banana Pancakes";
        recipe.servings = 0;
        recipe.ingredients = List.of("Flour", "Eggs", "Milk", "Bananas");

        IO.println("Recipe: " + recipe.name);
        IO.println("Servings: " + recipe.servings);
        IO.println("Ingredients: " + recipe.ingredients);
    }
}
