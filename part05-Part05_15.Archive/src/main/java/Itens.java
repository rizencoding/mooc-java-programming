public class Itens {
    private String id;
    private String name;

    public Itens(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return this.id+": "+this.name;
    }
    public String getId(){
        return this.id;
    }
    public boolean equals(Object compared){
        if(!(compared instanceof Itens)){
            return false;
        }
        Itens compItens = (Itens) compared;
        if(this.id.equals(compItens.id)){
            return true;
        }
        return false;
    }
}
