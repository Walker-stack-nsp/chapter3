import java.util.List;

public class Recipe {

    public String name;

    public int servings;

    public List<String> ingredients;

    public Recipe(String name, int servings, List<String> ingredients) {
        this.name = name;
        this.servings = servings;
        this.ingredients = ingredients;
    }
}
