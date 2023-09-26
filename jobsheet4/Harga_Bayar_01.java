import java.util.Scanner;
public class Harga_Bayar_01{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String merkBuku;
        int harga, jumlah;
        double dis=0.1, total, bayar, jmlDis;

        System.out.println("Masukkan merk buku yang anda beli");
        merkBuku=input.nextLine();
        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah" + jmlDis);
        System.out.println("Jumlah yang harus anda bayar adalah" +bayar);
    }
}