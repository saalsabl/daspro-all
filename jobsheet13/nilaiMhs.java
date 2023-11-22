import java.util.Scanner;

public class nilaiMhs {

    static String[] namaMhs;
    static int[][] nilaiMhs;

    static void inputJumlahMhsTugas() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        namaMhs = new String[jumlahMhs];

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();
        nilaiMhs = new int[jumlahMhs][jumlahTugas];

        for (int i = 0; i < namaMhs.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMhs[i] = sc.next();
            System.out.print("Masukkan nilai tugas " + namaMhs[i] + " : ");
            for (int j = 0; j < nilaiMhs[i].length; j++) {
                nilaiMhs[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    static void tampilkanNilai() {
        System.out.println("Nilai Mahasiswa :");
        for (int i = 0; i < namaMhs.length; i++) {
            System.out.print(namaMhs[i] + ": ");
            for (int j = 0; j < nilaiMhs[i].length; j++) {
                System.out.print(nilaiMhs[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int mingguNilaiTertinggi() {
        int mingguTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < nilaiMhs[0].length; j++) {
            int totalNilaiMinggu = 0;
            for (int i = 0; i < namaMhs.length; i++) {
                totalNilaiMinggu += nilaiMhs[i][j];
            }
            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                mingguTertinggi = j + 1;
            }
        }
        return mingguTertinggi;
    }

    static void mahasiswaNilaiTertinggi(int minggu) {
        int nilaiTertinggi = 0;
        String mhsTertinggi = "";

        for (int i = 0; i < namaMhs.length; i++) {
            if (nilaiMhs[i][minggu - 1] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i][minggu - 1];
                mhsTertinggi = namaMhs[i];
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mhsTertinggi + " dengan nilai " + nilaiTertinggi + ", pada minggu ke-" + minggu);
    }

    public static void main(String[] args) {
        inputJumlahMhsTugas();
        tampilkanNilai();
        int mingguTertinggi = mingguNilaiTertinggi();
        System.out.println("Pada minggu ke-" + mingguTertinggi + " terdapat nilai tertinggi dibandingkan minggu lain.");
        mahasiswaNilaiTertinggi(mingguTertinggi);
    }
}
