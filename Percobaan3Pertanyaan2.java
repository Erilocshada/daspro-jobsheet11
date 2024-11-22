import java.util.Scanner;

public class Percobaan3Pertanyaan2{
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItem[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;

        System.out.println("Masukkan jumlah jenis menu yang ingin Anda pesan: ");
        int jumlahMenu = sc.nextInt();

        for (int i = 1; i <= jumlahMenu; i++) {
            System.out.println("Pesanan ke-" + i + ":");
            
            System.out.println("Masukkan No Menu yang Anda Pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.println("Masukkan Banyak item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHargaMenu = hitungTotalHarga(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHargaMenu;
        }

        sc.nextLine();

        System.out.println("Masukkan Kode Promo (jika ada): ");
        String kodePromo = sc.nextLine();

        if (kodePromo.equalsIgnoreCase("DISKON50%")) {
            totalKeseluruhan = totalKeseluruhan - (totalKeseluruhan * 50 / 100);
        } else if (kodePromo.equalsIgnoreCase("DISKON30%")) {
            totalKeseluruhan = totalKeseluruhan - (totalKeseluruhan * 30 / 100);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo \"" + kodePromo + "\" tidak valid. Tidak ada diskon yang diterapkan.");
        }

        System.out.println("Total Harga untuk semua pesanan Anda: RP " + totalKeseluruhan);
    }
}
