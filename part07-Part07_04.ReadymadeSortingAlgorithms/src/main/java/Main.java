import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        String[] arrayy = {"rafale", "emanuela", "milenna", "luciana", "caio"};
        sort(arrayy);
        ArrayList<Integer> numbers = new ArrayList<>(
            Arrays.asList(9,10,2,3,6,2,8,9)
        );
        Main.sortIntegers(numbers);
        ArrayList<String> strings = new ArrayList<>(
            Arrays.asList("rafa","emanuela","milenna","caio","luciana")
        );
        Main.sortStrings(strings);
    }

    public static void sort(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
        System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
        System.out.println(strings);
    }
}
