import java.util.Scanner;

public class Ucapan_01 {
    public static void PenerimaUcapan(){       
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        System.out.println("Ucapan diberikan kepada: " + namaOrang);
        sc.close();
    }
    public static void main(String[] args) {
        PenerimaUcapan();
        System.out.println("Thank you, May the force be with you.");
    }
}
