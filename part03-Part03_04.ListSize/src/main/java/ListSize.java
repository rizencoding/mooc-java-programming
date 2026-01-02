
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true){
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            list.add(name);
        }
        System.out.println(list.size());
    }
}
