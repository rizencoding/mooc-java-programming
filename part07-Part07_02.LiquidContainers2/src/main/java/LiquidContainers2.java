
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();

        while (true) {
            System.out.println("First: "+c1);
            System.out.println("Second: "+c2);
            System.out.print("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);

            if(command.equals("add")){
                c1.add(amount);
            }else if(command.equals("move")){
                if(c1.contains() > 0){
                    if(amount > c1.contains()){
                        amount = c1.contains();
                        c2.add(amount);
                    }else{
                        c2.add(amount);
                    }
                    c1.remove(amount);
                }
            }else if(command.equals("remove")){
                c2.remove(amount);
            }

        }
    }

}
