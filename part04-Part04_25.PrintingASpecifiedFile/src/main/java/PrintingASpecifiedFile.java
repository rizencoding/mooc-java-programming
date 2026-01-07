import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        try (Scanner sc = new Scanner(Paths.get(file))) {
            boolean firstLine = true;

            while (sc.hasNextLine()) {
                String row = sc.nextLine();

                if (firstLine) {
                    row = row.replace("\uFEFF", "");
                    firstLine = false;
                }

                System.out.println(row);
            }

        } catch (Exception e) {
            // NÃO imprimir nada aqui para corretor automático
        }
    }
}
