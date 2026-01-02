
public class Greatest {

    public static int greatest(int number1, int number2, int number3){
        if (number1 > number2 && number1 > number3){
            return number1;
        } else if( number2 > number1 && number2 > number3){
            return number2;
        } else if (number3 > number1 && number3 > number2){
            return number3;
        } else if (number1 > number2 && number1 == number3){
            return number1;
        } else if (number2 > number1 && number2 == number3){
            return number2;
        } else if (number3 > number1 && number3 ==number2){
            return number3;
        } else if ( number1 == number2 && number1 == number3){
            return number1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int result = greatest(4, 9, 9);
        System.out.println("Greatest: " + result);
    }
}
