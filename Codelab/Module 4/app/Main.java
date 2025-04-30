package app;

import perpustakaan.Buku;
import perpustakaan.Fiksi;
import perpustakaan.Anggota;
import perpustakaan.Nonfiksi;

public class MainModul4 {
    public static void main(){
        perpustakaan.Buku fiksi = new Fiksi("Real", "Takehiko Inoue");
        perpustakaan.Buku nonfiksi = new Nonfiksi("Metamorphosis", "Franz Kafka");

        fiksi.displayInfo();
        nonfiksi.displayInfo();

        System.out.println();

        Anggota ovan = new Anggota("Ovan", "506");
        Anggota chesta = new Anggota("Chesta", "376");

        ovan.nameList();
        chesta.nameList();

        ovan.borrowBook("Real");
        chesta.borrowBook("Metamorphosis", 24);
        ovan.returnBook("Real");

    }

}