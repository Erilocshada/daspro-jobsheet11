import java.util.Scanner;

public class Percobaan3Pertanyaan {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50%")) {
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        } else if (kodePromo.equalsIgnoreCase("DISKON30%")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo \"" + kodePromo + "\" tidak valid. Tidak ada diskon yang diterapkan.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan No Menu yang Anda Pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.println("Masukkan Banyak item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();


        System.out.println("Masukkan Kode Promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total Harga untuk pesanan Anda: RP " + totalHarga);
    }
}
