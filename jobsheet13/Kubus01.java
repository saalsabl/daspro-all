import java.util.Scanner;

public class Kubus01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s, Lp, vol;

        System.out.println("Masukkan sisi ");
        s = input.nextInt();

        Lp=hitungLuas(s);
        System.out.println("Luas Permukaan kubus adalah " + Lp);

        vol=hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol);
    }
    static int hitungLuas (int s){
        int Luas = 6*s;
        return Luas;
    }
    static int hitungVolume (int s){
        int volume = s*s*s;
        return volume;
      }
    }


    