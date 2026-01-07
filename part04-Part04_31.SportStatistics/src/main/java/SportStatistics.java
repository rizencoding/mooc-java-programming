
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> stats = new ArrayList<>();
        System.out.println("File: ");
        String file = scan.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                stats.add(line);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Team: ");
        String team = scan.nextLine();
        int quant = 0;
        int wins = 0;
        int losses = 0;
        for(String linha : stats){
            String[] parts = linha.split(",");
            String homeTeam = parts[0];
            String awayTeam = parts[1];
            int homeP = Integer.valueOf(parts[2]);
            int awayP = Integer.valueOf(parts[3]);
            if(homeTeam.equals(team)){
                quant++;
                if(homeP > awayP){
                    wins++;
                }else{
                    losses++;
                }
            }
            if(awayTeam.equals(team)){
                quant++;
                if(awayP > homeP){
                    wins++;
                }else{
                    losses++;
                }
            }
        }
        System.out.println("Games: "+quant);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);
    }

}
