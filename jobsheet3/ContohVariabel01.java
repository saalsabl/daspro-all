public class ContohVariabel01 {

    public static void main(String args[]){
        String salah_satu_hoby_saya_adalah = "Memasak";
        boolean isPandai = true;
        char jenis_kelamin = 'P';
        byte umur_saya_sekarang = 19;
        double ipk = 3.80, tinggi = 1.50;
        System.out.println(salah_satu_hoby_saya_adalah);
        System.out.println("Apakah pandai?" + isPandai);
        System.out.println("Jenis kelamin:" + jenis_kelamin);
        System.out.println("Umurku saat ini:" + umur_saya_sekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
    }