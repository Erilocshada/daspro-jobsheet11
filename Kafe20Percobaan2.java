

public class Kafe20Percobaan2 {
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, "+namaPelanggan+" !");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap Pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - RP 15,000");
        System.out.println("2. Cappucino - RP 20,000");
        System.out.println("3. Latte - RP 22,000");
        System.out.println("4. Teh Tarik - RP 12,000");
        System.out.println("5. Roti Bakae - RP 10,000");
        System.out.println("6. Mie Goreng - RP 18,000");
        System.out.println("=========================");
        if (kodePromo.equalsIgnoreCase("DISKON50%")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50% untuk setiap pembelian.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30%")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30% untuk setiap pembelian.");
        }else if (!kodePromo.isEmpty()) {
            System.out.println("Kode Promo \""+kodePromo+"\" Tidak Valid");
        }else {
            System.out.println("Tidak ada Promo yang digunakan.");
        }
        System.out.println("Silahkan Pilih Menu yang anda inginkan.");
    }
    public static void main(String[] args) {
        menu("Andi",  true, "DISKON20%");
    }
}
