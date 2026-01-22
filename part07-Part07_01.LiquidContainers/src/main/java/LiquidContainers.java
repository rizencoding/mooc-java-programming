
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        while (true) {
            System.out.println("First: "+cont1+"/100");
            System.out.println("Second: "+cont2+"/100");
            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if(parts[0].equals("add")){
                if(amount > 0){
                    if(amount + cont1 > 100){
                        cont1 = 100;
                    }else{
                        cont1 = cont1 +amount;
                    }
                }
            }else if(command.equals("move")){
                if(amount > 0){
                    if(amount > cont1){
                        if(cont1 + cont2 > 100){
                            cont2 = 100;
                            cont1 = 0;
                            System.out.println("First: "+cont1+"/100");
                            System.out.println("Second: "+cont2+"/100");
                        }else{
                            cont2 += cont1;
                            cont1 = 0;
                            System.out.println("First: "+cont1+"/100");
                            System.out.println("Second: "+cont2+"/100");
                        }
                    }else{
                        if(cont2 + amount > 100){
                            cont2 = 100;
                        }else{
                            cont2 += amount;
                            cont1 -= amount;
                        }
                    }
                }
            }else if(command.equals("remove")){
                if(amount < cont2){
                    cont2 -= amount;
                }else{
                    cont2 = 0;
                }
            }
        }
    }

}
