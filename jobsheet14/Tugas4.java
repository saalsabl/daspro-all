import java.util.Scanner;
public class Tugas4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    System.out.print("Bulan ke : ");
    n = sc.nextInt();

    System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + n + " adalah : " + hitungFibonacci(n));
}   
public static int hitungFibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return hitungFibonacci(n - 1) + hitungFibonacci(n - 2);
    }
} 
}
