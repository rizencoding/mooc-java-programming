import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.println("Pages: ");
            String quant = scanner.nextLine();
            int pages = Integer.valueOf(quant);
            System.out.println("Publication year: ");
            String publ = scanner.nextLine();
            int year = Integer.valueOf(publ);
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed? ");
        String ans = scanner.nextLine();
        if(ans.equals("everything")){
            for(Book book: books){
                System.out.println(book);
            }
        }else if(ans.equals("name")){
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }
    }
}
