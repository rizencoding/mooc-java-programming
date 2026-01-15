import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner sc, SimpleDictionary sDictionary){
        this.scanner = sc;
        this.simpleDictionary = sDictionary;
    }

    public void start(){
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if(command.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            }else if(command.equals("search")){
                System.out.println("To be translated: ");
                String translated = scanner.nextLine();
                String transl = simpleDictionary.translate(translated);
                if(transl == null){
                    System.out.println("Word "+translated+ " was not found");
                }else{
                    System.out.println("Translation: "+transl);
                }
            }else if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else{
                System.out.println("Unknown command");
            }
        }
    }
}
