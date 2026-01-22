public class Bird {
    private String name;
    private String latin;
    private int obs;

    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.obs = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getLatin(){
        return this.latin;
    }

    public int getObs(){
        return this.obs;
    }
    
    public void addObs(){
        this.obs++;
    }

}
