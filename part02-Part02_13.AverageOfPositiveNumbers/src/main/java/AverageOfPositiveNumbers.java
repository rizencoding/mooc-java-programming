
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quant = 0;
        double media = 0;
        while (true){
            System.out.println("Give a number: ");
            int n1 = Integer.valueOf(scanner.nextLine());
            if (n1 > 0){
                soma = soma + n1;
                quant += 1;
                media = soma / (double) quant;
            } else if (n1 == 0){
                if (quant == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    System.out.println(media);
                    break;
                }
            }
        }
    }
}
