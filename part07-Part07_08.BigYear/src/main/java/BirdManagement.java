import java.util.ArrayList;

public class BirdManagement {
    private ArrayList<Bird> birds;

    public BirdManagement(){
        this.birds = new ArrayList<>();
    }

    public void add(Bird bird){
        this.birds.add(bird);
    }
    public void observation(String name){

        for(Bird bird : birds){
            if(bird.getName().equalsIgnoreCase(name)){
                bird.addObs();
                return;
            }
        }
    }


    public void printAll(){
        for (Bird bird : birds) {
            System.out.println(
                bird.getName() + " (" +
                bird.getLatin() + "): " +
                bird.getObs() + " observations"
            );
        }
    }

    public void printOne(String name){
        for(Bird bird : birds){
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(
                    bird.getName() + " (" +
                    bird.getLatin() + "): " +
                    bird.getObs() + " observations"
                );
                return;
            }
        }
    }
}
