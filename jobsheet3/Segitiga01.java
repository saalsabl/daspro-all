import java.util.Scanner;
public class Segitiga01 {
    
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan alas:");
int alas = sc.nextInt();

System.out.print("Masukkan tinggi:");
int tinggi = sc.nextInt();

float luas;

luas = alas * tinggi / 2;
System.out.println("Luas segitiga:" + luas);


    }
}
