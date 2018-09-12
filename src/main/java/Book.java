public class Book {
    private String title;
    private String writerLastName;
    private String writerFirstName;
    private int timesOut = 0;
    private boolean isAvailable = true;


    public Book(String title, String writerFirstName,String writerLastName, boolean isAvailable){
        this.title = title;
        this.writerLastName = writerLastName;
        this.writerFirstName = writerFirstName;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writerLastName='" + writerFirstName + '\'' +
                ", writerFirstName='" + writerLastName + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

