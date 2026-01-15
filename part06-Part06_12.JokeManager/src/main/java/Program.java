
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeManager jk = new JokeManager();
        UserInterface ui = new UserInterface(jk, scanner);
        ui.start();
    }
}
