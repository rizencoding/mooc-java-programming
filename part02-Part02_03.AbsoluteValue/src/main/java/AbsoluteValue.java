
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n1 = Integer.valueOf(scanner.nextLine());
        if (n1 < 0){
            System.out.println(n1 * -1);
        } else{
            System.out.println(n1);
        }
    }
}
