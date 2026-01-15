import java.util.ArrayList;

public class Room {
    private ArrayList<Person> roommates;

    public Room(){
        this.roommates = new ArrayList<>();
    }

    public void add(Person person){
        roommates.add(person);
    }

    public boolean isEmpty(){
        if(roommates.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return roommates;
    }

    public Person shortest(){
        if(roommates.isEmpty()){
            return null;
        }

        Person shortest = roommates.get(0);
        for(Person person: roommates){
            if(person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    public Person take(){
        if(roommates.isEmpty()){
            return null;
        }
        Person p = shortest();
        roommates.remove(p);
        return p;
    }
}
