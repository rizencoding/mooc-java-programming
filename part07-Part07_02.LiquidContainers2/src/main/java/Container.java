public class Container {
    private int content;

    public Container(){

    }

    public void add(int amount){
        if(amount > 0){
            if(amount + content > 100){
                content = 100;
            }else{
                content += amount;
            }
        }
    }

    public int contains(){
        return content;
    }

    public void remove(int amount){
        if(amount > 0){
            if(content - amount > 0){
                content -= amount;
            }else{
                content = 0;
            }
        }
    }

    public String toString(){
        return content+"/100";
    }
}
