
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longestName = "";
        while (true) {
            String person = scanner.nextLine();
            if(person.equals("")){
                break;
            }
            String[] parts = person.split(",");
            int year = Integer.valueOf(parts[1]);
            String name = parts[0];
            int lenght = name.length();
            sum = sum + year;
            count++;
            if(lenght > longestName.length()){
                longestName = name;
            }
        }
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+ 1.0 * sum / count);
    }
}
