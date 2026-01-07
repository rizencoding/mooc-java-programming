
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        if (file.equals("names.txt")){
            try (Scanner sc = new Scanner(Paths.get("names.txt"))){
                while(sc.hasNextLine()){
                    list.add(sc.nextLine());
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }else if(file.equals("other-names.txt")){
            try (Scanner scc = new Scanner(Paths.get("other-names.txt"))){
                while(scc.hasNextLine()){
                    list.add(scc.nextLine());
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }else{
            System.out.println("Reading the file "+file+" failed.");
        }
        System.out.println("");

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if(list.contains(searchedFor)){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }
    }
}
