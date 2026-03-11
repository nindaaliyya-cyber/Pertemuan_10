package Pertemuan_9;

class Buku {
    String judul;
    String pengarang;
    int harga;

    public Buku() {
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }

    public Buku(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga     : " + "Rp" + " "+ harga);
        System.out.println();
    }
}

public class LatihanBukuConstructor {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.tampilkanInfo();

        Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        buku2.tampilkanInfo();

        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);
        buku3.tampilkanInfo();
    }
}