
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        if(file.equals("numbers-1.txt")){
            try (Scanner sc = new Scanner(Paths.get("numbers-1.txt"))) {
                while(sc.hasNextLine()){
                    numbers.add(sc.nextInt());
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }else if(file.equals("numbers-2.txt")){
            try (Scanner scc = new Scanner(Paths.get("numbers-2.txt"))){
                while(scc.hasNextLine()){
                    numbers.add(scc.nextInt());
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println(" ");

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int cont = 0;
        int i = 0;
        while(i < numbers.size()){
            if(lowerBound <= numbers.get(i) && numbers.get(i) <= upperBound){
                cont++;
            }
            i++;
        }
        System.out.println("Numbers: "+cont);
    }

}
