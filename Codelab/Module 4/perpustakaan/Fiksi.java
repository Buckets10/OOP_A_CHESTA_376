package perpustakaan;

public class Fiksi extends Buku{
    public Fiksi(String title, String author){
        super(title, author);
    }

    @Override
    public void displayInfo(){
        System.out.println("Fiction Book Title: " + title + ", Author: " + author);
    }
}