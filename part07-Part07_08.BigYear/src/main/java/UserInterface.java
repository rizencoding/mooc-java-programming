import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdManagement birdManagement;

    public UserInterface(Scanner scanner, BirdManagement birdManagement){
        this.scanner = scanner;
        this.birdManagement = birdManagement;
    }

    public void start(){
        System.out.println("Commands: ");
        System.out.println();
        System.out.println("Add - adds a bird ");
        System.out.println("Observation - adds an observation ");
        System.out.println("All - prints all birds ");
        System.out.println("One - prints one bird ");
        System.out.println("Quit - ends the program ");

        while (true) {
            System.out.print("Enter a command:");
            String comm = scanner.nextLine();
            if(comm.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();
                birdManagement.add(new Bird(name, latin));
            }else if(comm.equals("Observation")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                birdManagement.observation(bird);
            }else if(comm.equals("All")){
                birdManagement.printAll();
            }else if(comm.equals("One")){
                System.out.print("Name? ");
                String name = scanner.nextLine();
                birdManagement.printOne(name);
            }else if(comm.equals("Quit")){
                break;
            }else{
                System.out.println("Incorrect input.");
            }
        }
    }
}
