import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner sc){
        this.jokeManager = jokeManager;
        this.scanner = sc;
    }

    public void start(){
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1- add a joke");
            System.out.println("2- draw a joke");
            System.out.println("3- list jokes");
            System.out.println("X- ending");
            String opt = scanner.nextLine();
            if(opt.equals("X")){
                break;
            }else if(opt.equals("1")){
                System.out.println("Write the joke to be added: ");
                jokeManager.addJoke(scanner.nextLine());
            }else if(opt.equals("2")){
                System.out.println(jokeManager.drawJoke());
            }else if(opt.equals("3")){
                System.out.println("printing the jokes.");
                jokeManager.printJokes();
            }
        }
    }
}
