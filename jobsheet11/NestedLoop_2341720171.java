package jobsheet11;
import java.util.Scanner;
public class NestedLoop_2341720171{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] temps = new int[5][7];

        for (int i = 0; i < temps.length; i++){
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0]. length; j++){
                System.out.print("Hari ke-" + (j+1) + ": ");
                temps[i][j] = (int) input.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++){
            System.out.print("Kota ke-" + (i+1) + ":");
            for (int j = 0; j < temps[0].length; j++){
                System.out.print(temps [i][j] + " ");
            }
            System.out.println();
        }
    }
}
