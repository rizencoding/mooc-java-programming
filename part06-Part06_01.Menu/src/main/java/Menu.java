
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(meals.contains(meal) == false){
            meals.add(meal);
        }else{
            System.out.println("This meal is already on the list.");
        }
    }

    public void printMeals(){
        for(String meal: meals){
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        meals.removeAll(meals);
    }
}
