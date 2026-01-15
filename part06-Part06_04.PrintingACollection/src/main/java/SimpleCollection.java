
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        if(elements.isEmpty()){
            String printOutput = "The collection "+this.name+" is empty.";
            return printOutput;
        }
        String elementss = "";
        for(int i = 0; i< elements.size(); i++){
            elementss += elements.get(i);
            if(i < elements.size() -1){
                elementss += "\n";
            }
        }
        if(elements.size() == 1){
            return "The collection "+this.name+" has "+
            elements.size()+
            " element:\n"+elementss;
        }
        return "The collection "+this.name+" has "+
        elements.size()+
        " elements:\n"+elementss;
       
    }
    
}
