package jobsheet7;
import java.util.Scanner;
public class WhileGaji01Pertanyaan3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0;
        double totalGajiLembur = 0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = scan.nextInt();
        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1)+ ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = scan.nextInt();

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur :" + totalGajiLembur);
            i++;
        }
    }
}


