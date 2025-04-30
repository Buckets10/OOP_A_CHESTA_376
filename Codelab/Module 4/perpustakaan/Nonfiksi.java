package perpustakaan;

public class Nonfiksi extends Buku{
    public Nonfiksi(String title, String author){
        super(title, author);
    }

    @Override
    public void displayInfo(){
        System.out.println("Non-Fiction Book title: " + title + ", Author: " + author);
    }
}