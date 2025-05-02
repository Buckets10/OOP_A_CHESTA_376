package perpustakaan;

public interface BookLoan {
    void returnBook(Book book);
    void borrowBook(Book book);
}