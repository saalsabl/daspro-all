import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f : ");
        int f = sc.nextInt();

        int hasil = penjumlahanRekursif(f);
        System.out.println("Hasil penjumlahan : " + hasil);

        sc.close();
    }
    public static int penjumlahanRekursif(int n){
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }
    
}
