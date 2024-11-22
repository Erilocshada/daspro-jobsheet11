
import java.util.Scanner;

public class percobaan6 {
    public static int hitungLuas(int p, int l) {
        int Luas = p*l;
        return Luas;
    }
    public static int hitungVolume(int tinggi, int a, int b) {
        int Volume = hitungLuas(a, b)*tinggi;
        return Volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, l, t, L, vol;
        System.out.println(" Masukkan Panjang: ");
        p = sc.nextInt();
        System.out.println("Masukkan lebar :");
        l = sc.nextInt();
        System.out.println("Masukkan tinggi :");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah "+L+ "cm");
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Persegi panjang adalah "+vol+"cm");
    }
}
