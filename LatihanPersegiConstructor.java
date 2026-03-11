package Pertemuan_9;

class BangunDatar {
    int sisi;
    int luas;
    int keliling;

    public BangunDatar(int sisi) {
        if (sisi <= 0) {
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }

        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }

    public void tampilkanHitungan() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + sisi);
        System.out.println("Luas     : " + luas + " cm²");
        System.out.println("Keliling : " + keliling + " cm");
        System.out.println();
    }
}

public class LatihanPersegiConstructor {
    public static void main(String[] args) {

        BangunDatar persegi1 = new BangunDatar(5);
        persegi1.tampilkanHitungan();

        BangunDatar persegi2 = new BangunDatar(0);
        persegi2.tampilkanHitungan();
    }
}