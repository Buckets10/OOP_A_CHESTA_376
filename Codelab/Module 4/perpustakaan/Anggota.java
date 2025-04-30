package perpustakaan;

public class Anggota implements Peminjaman{
    private final String name;
    private final String anggotaID;

    public Member(String name, String memberID){
        this.name = name;
        this.anggotaID = memberID;
    }
    public void nameList(){
        System.out.println("Member: " + name + " ID: " + anggotaID);
    }

    @Override
    public void borrowBook(String title){
        System.out.println(name + "(" + anggotaID+ ")" + " borrowed the book " + title);
    }

    @Override
    public void borrowBook(String title, int duration){
        System.out.println(name + "(" + anggotaID+ ")" + " borrowed the book: " + title + " for " + duration + " days.");
    }

    @Override
    public void returnBook(String title){
        System.out.println(name + "(" + anggotaID+ ")" + " returned the book: " + title);
    }
}