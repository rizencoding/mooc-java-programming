
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }
            numbers.add(number);
        }
        int i = 0;
        while (i < numbers.size()){
            System.out.println(numbers.get(i));
            i++;
        }
    }
}
