
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Itens> itens = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.equals("")){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            Itens it = new Itens(id, name);
            if(itens.contains(it)){
                System.out.println("Already exists.");
            }else{
                itens.add(it);
            }
        }
        System.out.println("==Items==");
        int i = 0;
        while(i < itens.size()){
            System.out.println(itens.get(i));
            i++;
        }

    }
}
