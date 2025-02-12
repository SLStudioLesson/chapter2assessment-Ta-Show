import java.util.ArrayList;

public class RecipeUI {
    public void displayMenu(ArrayList<String> recipes) {
        if (recipes.isEmpty()) {
            System.out.println("No recipes available.");
        } else {
            for(String recipe : recipes) {
                System.out.println("-----------------------------------");
                System.out.println(recipe);
            }
        }
    }
}