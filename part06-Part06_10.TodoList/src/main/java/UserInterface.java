import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner sc){
        this.todoList = todoList;
        this.scanner = sc;
    }

    public void start(){
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                System.out.println("To add: ");
                todoList.add(scanner.nextLine());
            }else if(command.equals("list")){
                todoList.print();
            }else if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                todoList.remove(scanner.nextInt());
            }
        }
    }
}
