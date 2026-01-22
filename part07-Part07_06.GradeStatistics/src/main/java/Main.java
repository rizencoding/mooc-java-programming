
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] gradeDistribution = new int[6];
        int sum = 0;
        int quant = 0;
        double avg = 0;
        int sumPassing = 0;
        int countPassing = 0;
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }
            if(number >= 0 && number <= 100){
                sum  += number;
                quant++;
                if(number >= 50){
                    sumPassing += number;
                    countPassing++;
                }
                int grade;
                switch(number / 10){
                    case 10:
                    case 9:
                        grade = 5;
                        break;
                    case 8:
                        grade = 4;
                        break;
                    case 7: 
                        grade = 3;
                        break;
                    case 6:
                        grade = 2;
                        break;
                    case 5:
                        grade = 1;
                        break;
                    default:
                        grade = 0;
                }
                gradeDistribution[grade]++;
            }
        }
        avg = 1.0 * sum / quant;
        System.out.println("Point average (all): "+avg);
        if(countPassing > 0){
            double avgPassing = (double) sumPassing / countPassing;
            System.out.println("Point average (passing): "+avgPassing);
        }else{
            System.out.println("Point average (passing): "+"-");
        }
        double percent = 100.0 * countPassing / quant;
        System.out.println("Pass percentage: "+percent);
        System.out.println("Grade distribution: ");
        for(int i = 5; i >= 0; i--){
            System.out.print(i+": ");
            for(int j = 0; j < gradeDistribution[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
