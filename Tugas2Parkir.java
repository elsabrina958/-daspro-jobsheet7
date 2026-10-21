import java.util.Scanner;
public class Tugas2Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan: (1. Mobil, 2. Motor, 0. Keluar) ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

            if (jenis == 1) {
                total += durasi * 3000;
                System.out.println("Total sementara: " +total);
            } else if (jenis == 2) {
                total += durasi * 2000;
                System.out.println("Total sementara: " +total);
            } 
        } else if(jenis != 0) {
            System.out.println("Jenis kendaraan tidak valid! Silahkan masukkan 1, 2, atau 0.");
        }
        } while (jenis !=0) ;
        System.out.println("Total uang parkir : Rp " +total);
        sc.close();
    }
}