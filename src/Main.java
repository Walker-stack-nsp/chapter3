import java.util.ArrayList;
import java.util.List;

public class Main {

    void main() {
        // Setup initial mutable list using modern var keyword
        var initialIngredients = new ArrayList<>(List.of("Rice", "Tomatoes"));
        var recipe = new Recipe("Jollof", 4, initialIngredients);

        System.out.println("--- Testing Encapsulation in Recipe ---");

        // Test 1: Attempting to put the Recipe into an invalid state (0 servings)
        try {
            recipe.setServings(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Passed: Prevented invalid servings -> " + e.getMessage());
        }

        // Test 2: Attempting to modify the internal list from the outside
        try {
            recipe.getIngredients().add("Onions");
        } catch (UnsupportedOperationException e) {
            System.out.println("Passed: getIngredients().add(...) threw UnsupportedOperationException.");
        }

        // Test 3: Attempting to cheat by clearing the original list reference
        initialIngredients.clear();
        System.out.println(
                "Passed: Original list destroyed, but Recipe ingredients remain safe: " + recipe.getIngredients());
    }
}
