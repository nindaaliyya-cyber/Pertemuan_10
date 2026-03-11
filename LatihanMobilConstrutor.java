package Pertemuan_9;

class Mobil {
    String merk;
    String warna;
    int tahun;

    public Mobil() {
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }

    public Mobil(String merk) {
        this.merk = merk;
        warna = "Belum diisi";
        tahun = 0;
    }

    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public void tampilkanInfo() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println();
    }
}

public class LatihanMobilConstrutor {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.tampilkanInfo();

        Mobil mobil2 = new Mobil("Toyota");
        mobil2.tampilkanInfo();

        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
        mobil3.tampilkanInfo();
    }
}