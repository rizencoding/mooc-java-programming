import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingregients;

    public Recipe(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.time = time;
        this.ingregients = ingredients;
    }

  
    public String getName() {
        return name;
    }

    public int getTime(){
        return time;
    }

    public ArrayList<String> getIngredients(){
        return ingregients;
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + time;
    }
}
