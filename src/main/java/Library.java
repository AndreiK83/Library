import java.util.ArrayList;
import java.util.List;

public class Library {
    private Book book;
    private List<Book> books;
    private Client client;
    private List<Client> clients;

    public Library(List<Book> books, List<Client> clients){
        this.books = new ArrayList<Book>();
        this.clients = new ArrayList<Client>();
    }

    public void addBook(){

    }
}
