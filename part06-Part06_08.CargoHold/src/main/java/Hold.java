import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> content;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.content = new ArrayList<>();
    }

    private int weight = 0;
    public void addSuitcase(Suitcase suitcase){
        if (weight + suitcase.totalWeight() <= this.maxWeight){
            content.add(suitcase);
            weight += suitcase.totalWeight();
        }
    }

    public String toString(){
        return content.size()+" suitcases "+"("+weight+" kg)";
    }

    public void printItems(){
        for(Suitcase suitcase:content){
            suitcase.printItems();
            System.out.println(suitcase.totalWeight());
        }
    }
}
