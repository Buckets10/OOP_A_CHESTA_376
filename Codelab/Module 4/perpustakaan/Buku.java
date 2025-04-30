package perpustakaan;

public abstract class Buku{
    protected String title;
    protected String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public abstract void displayInfo();
}