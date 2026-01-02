
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantNum = 0;
        double media = 0;
        while (true) {
            System.out.println("Give a number: ");
            int n1 = Integer.valueOf(scanner.nextLine());
            if (n1 != 0){
                soma = soma + n1;
                quantNum += 1;
                media = soma / (double)quantNum;
            } else{
                System.out.println("Average of the numbers: "+media);
                break;
            }
        }
    }
}
