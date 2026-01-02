
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        while (true){
            System.out.println("Give a number: ");
            int n1 = Integer.valueOf(scanner.nextLine());
            if (n1 == 0){
                System.out.println("Sum of the numbers: "+soma);
                break;
            }else{
                soma = soma + n1;
            }
        }
    }
}
