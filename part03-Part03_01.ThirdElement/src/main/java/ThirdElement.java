
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true){
            String name = scanner.nextLine();
            list.add(name);
            if (name.equals("")){
                break;
            }
        }
        System.out.println(list.get(2));
        
    }
}
