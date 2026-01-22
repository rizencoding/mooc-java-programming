
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if(name.isEmpty()){
                    continue;
                }

                int cookingTime = Integer.parseInt(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while(fileScanner.hasNextLine()){
                    String line = fileScanner.nextLine();
                    if(line.isEmpty()){
                        break;
                    }
                    ingredients.add(line);
                }

                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        }catch(Exception e){
            System.out.println("Error reading file.");
            return;
        }

        System.out.println("Commands: ");
        System.out.println("list- lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println();
            System.out.println("Enter command: ");
            String com = scanner.nextLine();

            if(com.equals("list")){
                System.out.println("Recipes: ");
                for(Recipe recipe : recipes){
                    System.out.println(recipe);
                }
            }else if(com.equals("find name")){
                System.out.println("Searched word: ");
                String word = scanner.nextLine();

                System.out.println("Recipes: ");
                for(Recipe recipe: recipes){
                    if(recipe.getName().contains(word)){
                        System.out.println(recipe);
                    }
                }
            }else if(com.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int max = Integer.valueOf(scanner.nextLine());

                System.out.println("Recipes: ");
                for(Recipe recipe: recipes){
                    if(recipe.getTime() <= max){
                        System.out.println(recipe);
                    }
                }
            }else if(com.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String searched = scanner.nextLine();

                System.out.println("Recipes: ");
                for(Recipe recipe: recipes){
                    for(String ingredient: recipe.getIngredients()){
                        if(ingredient.equalsIgnoreCase(searched)){
                            System.out.println(recipe);
                            break;
                        }
                    }
                }
            }else if(com.equals("stop")){
                break;
            }
        }


        }
    }


