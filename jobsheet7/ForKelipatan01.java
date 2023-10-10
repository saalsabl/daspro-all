package jobsheet7;
 import java.util.Scanner;
public class ForKelipatan01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, rataRata;
        int jumlah = 0;
        int counter = 0;
        int total = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();
        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
                total +=i;
                counter++;
                
            }

        }
        rataRata = jumlah / counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, rataRata);
    }
    
}
