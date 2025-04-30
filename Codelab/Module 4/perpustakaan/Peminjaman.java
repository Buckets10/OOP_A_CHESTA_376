package perpustakaan;

public interface Peminjaman {
    void borrowBook(String title);
    void returnBook(String title);
    void borrowBook(String title, int duration);
}