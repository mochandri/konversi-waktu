import java.util.Scanner;
public class wideningCasting {
    public static void main(String[] args) {
        System.out.println("Pilihan Konversi :\n"
                + "1. jam -> menit\n"
                + "2. Detik -> hari,jam,menit,detik\n");
        
        System.out.println("\n Masukkan Pilihan");
        
        try (Scanner options = new Scanner(System.in)){
            if (!options.hasNextInt()){
                System.out.println("Masukkan Angka, Anda salah !!");
            }else{
                if(options.nextInt() == 1){
                    System.out.println("Masukkan Jam :");
                    Scanner hours = new Scanner (System.in);
                    JamKeMenit (hours.nextInt());
                }else{
                    System.out.println("Masukkan Detik :");
                    try (Scanner seconds = new Scanner (System.in)){
                        DetikKeHari(seconds.nextLong());
                    }   
                }
            }
        }
}
    public static void JamKeMenit(long jam){
        long menit = jam * 60;
        System.out.println("Menit :"+menit);
    }
    public static void DetikKeHari (long detik){
        //hari
        int hari = (int) (detik / (60 * 60 * 24));
        //jam
        detik %= (60 * 60 * 24);
        int jam = (int) (detik / (60 * 60));
        //menit
        detik %= (60 * 60);
        int menit = (int) (detik / 60);
        //detik
        detik %= 60;
        System.out.println(hari+"hari,"+jam+"jam,"+menit+"menit,"+detik+"detik");
    }
}