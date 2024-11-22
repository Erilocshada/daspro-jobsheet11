import java.util.Scanner;

public class tugas2 {

    static int[][] penjualan;
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void inputPenjualan() {
        Scanner scanner = new Scanner(System.in);
        penjualan = new int[menu.length][7]; 

        System.out.println("========================");
        System.out.println("Masukkan data penjualan:");
        System.out.println("========================");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Penjualan untuk " + menu[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
        System.out.println("========================");
    }

    public static void tampilkanPenjualan() {
        System.out.println("========================");
        System.out.println("Data Penjualan per Menu:");
        System.out.println("========================");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " : ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("========================");
    }

    public static void tampilkanMenuTertinggi() {
        int totalPenjualan;
        int maxPenjualan = 0;
        String menuTertinggi = "";

        for (int i = 0; i < menu.length; i++) {
            totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }

            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("Menu dengan penjualan tertinggi adalah: " + menuTertinggi + " dengan total penjualan " + maxPenjualan);
    }

    public static void tampilkanRataRataPenjualan() {
        System.out.println("========================");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.println("Rata-rata penjualan " + menu[i] + " : " + rataRata);
        }
        System.out.println("========================");
    }

    public static void main(String[] args) {
        inputPenjualan(); 

        tampilkanPenjualan();

        tampilkanMenuTertinggi();

        tampilkanRataRataPenjualan();
    }
}
