package jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Masukkan jumlah element array : ");
    int n = scan.nextInt();
    int[] array = new int[n];

    System.out.println("Masukkan nilai tiap element : ");
    for (int i = 0; i < n; i++){
        System.out.print("Eelement ke-"+ (i+1)+" : ");
        array[i] = scan.nextInt();
    }
    int nilaiTertinggi = array[0];
    int nilaiTerendah = array[0];
    int jumlah = array[0];

    for (int i = 1; i < n; i++){
        if (array[i] > nilaiTertinggi){
            nilaiTertinggi = array[i];
        }
        if (array[i] < nilaiTerendah){
            nilaiTerendah = array[i];
        }
        jumlah += array[i];
        }
        double rataRata = (double) jumlah / n;

        System.out.println("Nilai tertinggi : "+ nilaiTertinggi);
        System.out.println("Nilai terendah : "+nilaiTerendah);
        System.out.println("Nilai rata-rata : "+rataRata);

        scan.close();
    }
}
