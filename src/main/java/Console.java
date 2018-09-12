import java.util.List;
import java.util.Scanner;

public class Console extends Main {
    private Scanner sc;
    private Book book;
    private List<Book> bookList;


    public Console() {
        sc = new Scanner(System.in);
        mainMenu();
    }

    private void mainMenu() {
        while (true) {
            switch (drawMainMenu()) {
                case 1:
                    addBook();
                    remouveBook();
//                    categories();
//                    app.insert(asocProp);
                    break;
                case 2:
//                    String codBancar;
//                    System.out.println("Introduceti codul bancar");
//                    codBancar = sc.nextLine();
//                    if (asocProp == null) {
//                        asocProp = new AsociatiaDeProprietari(apartamentList, codBancar);
//                        System.out.println("Asociatia a fost creata cu succes, cu codul bancar " + codBancar);
//                    } else {
//                        System.out.println("Exista asociatia cu codul bancar " + codBancar);
//                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("There is no such option");
            }
        }
    }


    public void addBook() {
        String title;
        String writerFirstName;
        String writerLastName;

        System.out.println("Insert the title");
        title = sc.nextLine();
        System.out.println("Insert the firstname of writer");
        writerFirstName = sc.nextLine();
        System.out.println("Insert the lastname of writer");
        writerLastName = sc.nextLine();
        this.book = new Book(title, writerFirstName, writerLastName, true);
        bookList.add(book);
        System.out.println(bookList);
    }

    private void remouveBook() {
    }


    private int drawMainMenu() {
        System.out.println("\n***********************************");
        System.out.println("Operations: ");
        System.out.println("1. Modification library");
        System.out.println("2. Create the library");
        System.out.println("3. Exit");
        System.out.println();
        System.out.println("Choose one operation higher");
        Integer optiune = sc.nextInt();
        sc.nextLine();
        return optiune;
    }
}
