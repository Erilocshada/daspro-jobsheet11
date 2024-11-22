import java.util.Scanner;

public class kubus20 {
    public static double hitungVolume(double sisi) {
        double volume = sisi*sisi*sisi;
        return volume;
    }
    public static double hitungLuasPermukaan(double sisi) {
        double luas = 6*(sisi*sisi);
        return luas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan panjang sisi kubus (dalam cm): ");

        if (!sc.hasNextDouble()) {
            System.out.println("Input harus berupa angka!");
            return;
        }

        double sisi = sc.nextDouble();

        if (sisi <= 0) {
            System.out.println("Panjang sisi kubus harus lebih dari 0!");
            return;
        }

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Panjang sisi kubus:"+ sisi+"cm");
        System.out.println("Volume kubus:"+ volume+"cm");
        System.out.println("Luas permukaan kubus:"+ luasPermukaan+"cm");
    }
}