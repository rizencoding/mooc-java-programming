
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int quant = 0;
        int soma = 0;
        while(true){
            int num = scanner.nextInt();
            if(num == -1){
                break;
            }
            list.add(num);
        }
        for(int number : list){
            quant++;
            soma = soma + number;
        }
        System.out.println("Average: "+ soma /(double)quant);
    }
}
