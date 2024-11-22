public class tugas2 {

    static int[][] penjualan = {
        {20, 20, 25, 20, 20, 30, 60}, 
        {30, 80, 40, 10, 15, 10, 10},
        {5, 9, 20, 20, 15, 45, 45},   
        {50, 8, 17, 15, 18, 20, 25},  
        {15, 16, 16, 16, 16, 10, 55}  
    };

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

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
        tampilkanPenjualan();
        
        tampilkanMenuTertinggi();

        tampilkanRataRataPenjualan();
    }
}
