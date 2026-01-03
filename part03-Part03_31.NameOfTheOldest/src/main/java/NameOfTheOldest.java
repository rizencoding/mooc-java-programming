
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestPerson ="";
        while (true) {
            String person = scanner.nextLine();
            if(person.equals("")){
                break;
            }
            String[] pieces = person.split(",");
            int age = Integer.valueOf(pieces[1]);
            int i = 0;
            while(i < pieces.length -1){
                if(age > oldest){
                    oldest = age;
                    oldestPerson = pieces[0];
                }
                i++;
            }
        }
        System.out.println("Name of the oldest: "+oldestPerson);
    }
}
