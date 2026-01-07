
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cube = 0;
        while (true) {
            String text = scanner.nextLine();
            if(text.equals("end")){
                break;
            }
            int number = Integer.valueOf(text);
            cube = number * number * number;
            System.out.println(cube);
        }
    }
}
