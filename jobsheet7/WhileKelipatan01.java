package jobsheet7;
import java.util.Scanner;
public class WhileKelipatan01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, rataRata;
        int jumlah = 0;
        int counter = 0;
        int i =1;

        System.out.println("Masukkan bilangan (1-9) : ");
        kelipatan = scan.nextInt();

        while (i<=50){
            if (i%kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        rataRata = (jumlah/counter);
        System.out.printf("Banyaknya bilangan dari %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, rataRata);
    }


}
