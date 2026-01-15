import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService(){
        this.messages = new ArrayList<>();
    }

    public void add(Message message){
        if(message.getContent().length()<= 280){
            messages.add(message);
        }else{
            System.out.println("The message is too long!");
        }
    }

    public ArrayList<Message> getMessages(){
        return messages;
    }
}
