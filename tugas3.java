import java.util.Scanner;

public class tugas3 {

    static int[][] nilai;
    static String[] mahasiswa = {"Mahasiswa 1", "Mahasiswa 2", "Mahasiswa 3", "Mahasiswa 4", "Mahasiswa 5"};

    public static void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        nilai = new int[mahasiswa.length][5]; // 5 mata pelajaran

        System.out.println("========================");
        System.out.println("Masukkan data nilai mahasiswa:");
        System.out.println("========================");

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Nilai untuk " + mahasiswa[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Mata pelajaran ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
        System.out.println("========================");
    }

    public static void tampilkanNilai() {
        System.out.println("========================");
        System.out.println("Data Nilai Mahasiswa:");
        System.out.println("========================");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + " : ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("========================");
    }

    public static void tampilkanNilaiTertinggi() {
        int maxNilai = 0;
        String mahasiswaTertinggi = "";
        int totalNilai;

        for (int i = 0; i < mahasiswa.length; i++) {
            totalNilai = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            }

            if (totalNilai > maxNilai) {
                maxNilai = totalNilai;
                mahasiswaTertinggi = mahasiswa[i];
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah: " + mahasiswaTertinggi + " dengan total nilai " + maxNilai);
    }

    public static void tampilkanRataRataNilai() {
        System.out.println("========================");
        for (int i = 0; i < mahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            }
            double rataRata = (double) totalNilai / nilai[i].length;
            System.out.println("Rata-rata nilai " + mahasiswa[i] + " : " + rataRata);
        }
        System.out.println("========================");
    }

    public static void main(String[] args) {
        inputNilai(); 

        tampilkanNilai();

        tampilkanNilaiTertinggi();

        tampilkanRataRataNilai();
    }
}
