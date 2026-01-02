
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int num = scanner.nextInt();
            if (num == -1){
                break;
            }
            list.add(num);
        }
        int soma = 0;

        for(int number: list){
            soma = soma + number;
        }
        System.out.println("Sum: "+soma);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
