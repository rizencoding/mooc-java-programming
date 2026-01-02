
public class StarSign {

    public static void main(String[] args) {
        christmasTree(7);
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number){
            System.out.print("*");
            i++;
        }   
        System.out.println();

    }

    public static void printSquare(int size) {
        int i = 0;
        while (i < size){
            printStars(size);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height){
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        while (i <= size){
            printStars(i);
            i++;
        }
    }
    public static void printSpaces(int number) {
        int i = 0;
        while (i < number){
            System.out.print(" ");
            i++;
        }
    }
    public static void christmasTree(int height) {
        int j = 1;
        while (j <= height){
            printSpaces(height - j);
            printStars(2*j -1);
            j++; 
        }
        int i = 0;
        while (i < 2){
            printSpaces(height-2);
            printStars(3);
            i++;
        }
    }
}
