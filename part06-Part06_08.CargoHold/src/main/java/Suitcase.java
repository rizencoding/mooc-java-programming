import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> itens;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.itens = new ArrayList<>();
    }
    private int weight = 0;
    public void addItem(Item item){
        if(weight + item.getWeight() <= this.maxWeight){
            itens.add(item);
            weight += item.getWeight();
        }
    }
    public String toString(){
        if(itens.size() == 0){
            return "no items ("+ weight +" kg)";
        } else if(itens.size() == 1){
            return itens.size()+ " item "+" ("+weight+" kg)";
        }
        return itens.size()+" items"+" ("+weight+" kg)";
    }

    public void printItems(){
        for(Item item : itens){
            System.out.println(item);
            
        }
    }

    public int totalWeight(){
        return  weight;
    }

    public Item heaviestItem(){
        if(itens.isEmpty()){
            return null;
        }
        Item i = itens.get(0);
        for(Item item : itens){
            if(i.getWeight() <= item.getWeight()){
                i = item;
            }
        }
        return i;
    }
}
