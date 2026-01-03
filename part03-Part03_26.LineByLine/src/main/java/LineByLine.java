
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(true){
            String phrase = scanner.nextLine();
            if(phrase.equals("")){
                break;
            }
            String[] pieces = phrase.split(" ");
            for(String partes: pieces){
                System.out.println(partes);
            }
        }    
    }
}
