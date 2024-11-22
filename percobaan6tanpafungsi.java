
import java.util.Scanner;

public class percobaan6tanpafungsi {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int p,l,t,L,vol;

    System.out.println("Masukkan Panjang :");
    p = sc.nextInt();
    System.out.println("Masukkan Lebar :");
    l = sc.nextInt();
    System.out.println("Masukkan tingi :");
    t = sc.nextInt();

    L = p*l;
    System.out.println("Luas Persegi Panjang adalah"+L+"cm");
    vol=p*l*t;
    System.out.println("Volume balok adalah "+vol+"cm");
    }
}
