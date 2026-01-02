
import java.util.ArrayList;

public class IoobProgram {

    public static void main(String[] args) {
        // Modify this program to cause an indexOutOfBoundsException 

        ArrayList<String> lines = new ArrayList<>();
        lines.get(1);
        for (String line : lines) {
            System.out.println(line);
        }

    }
}
