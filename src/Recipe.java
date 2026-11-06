import java.util.List;

public class Recipe {

    private String name;

    private int servings;

    private List<String> ingredients;

    public Recipe(String name, int servings, List<String> ingredients) {
        this.name = name;
        setServings(servings); // Use the setter to enforce validation
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServings() {
        return servings;
    }

    // The setter acts as a gatekeeper
    public void setServings(int servings) {
        if (servings < 1) {
            throw new IllegalArgumentException("Servings must be at least 1.");
        }
        this.servings = servings;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
