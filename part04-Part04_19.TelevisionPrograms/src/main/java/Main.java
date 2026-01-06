import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("Duration: ");
            String duration = scanner.nextLine();
            int durat = Integer.valueOf(duration);
            programs.add(new TelevisionProgram(name, durat));
        }
        System.out.println("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();
        for(TelevisionProgram query: programs){
            if(query.getDuration() <= maxDuration){
                System.out.println(query);
            }
        }
    }
}
