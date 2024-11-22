import java.util.Scanner;

public class hitungTotalHarga20 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan No Menu yang Anda Pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.println("Masukkan Banyak item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total Harga untuk pesanan Anda: RP " + totalHarga);
    }
}
