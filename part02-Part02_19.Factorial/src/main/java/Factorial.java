
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int i = number;
        int fat = 1;
    
        while (i > 0){
            fat = fat *i;
            i--;
        }
        System.out.println("Factorial: "+fat);

        /*for (int i = 1; i <= number; i++){
            fat = number * i;
        }
        System.out.println("Factorial: "+fat);*/
    }
}
