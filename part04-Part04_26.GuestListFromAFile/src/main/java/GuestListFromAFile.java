
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        if(file.equals("names.txt")){
            try (Scanner sc = new Scanner(Paths.get("names.txt"))) {
                while(sc.hasNextLine()){
                    list.add(sc.nextLine());
                }
            } catch (Exception e) {
            // TODO: handle exception
            }
        } else if(file.equals("other-names.txt")){
            try (Scanner scc = new Scanner(Paths.get("other-names.txt"))){
                while (scc.hasNextLine()) {
                    list.add(scc.nextLine());
                }
            } catch (Exception e) {
            // TODO: handle exception
            }
        }
                
        System.out.println("");


        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
