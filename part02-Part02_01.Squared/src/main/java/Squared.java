
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n1 = Integer.valueOf(scanner.nextLine());
        int op = n1 * n1;
        System.out.println(op);
    }
}
