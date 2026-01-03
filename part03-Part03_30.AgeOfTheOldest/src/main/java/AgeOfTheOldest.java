
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameAndAge = "";
        while (true) {
            nameAndAge = scanner.nextLine();
            if(nameAndAge.equals("")){
                break;
            }
            String[] parts = nameAndAge.split(",");
            int age = Integer.valueOf(parts[1]);
            int i = 0;
            while(i < parts.length -1){
                if (age > oldest){
                    oldest = age;
                }
                i++;
            }
        }
        System.out.println("Age of the oldest: "+oldest);
    }
}
