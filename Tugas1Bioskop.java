import java.util.Scanner;
public class Tugas1Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jmlTiket;
        int tiket = 50000;
        int totalTiketTerjual = 0;
        int hargaBayar;
        char lanjut;
        double harga;
        double diskon;
        double totalBayar;
        double potongan;
        double totalPendapatan = 0;
        
        do {
        do {
            System.out.println("Masukkan jumlah tiket yang dibeli: ");
            jmlTiket = sc.nextInt();
            if (jmlTiket < 0) { 
                System.out.println("Input tidak valid. Silahkan input ulang! ");
            }
        } while (jmlTiket < 0 );

        harga = jmlTiket * tiket;
        diskon = 0;

        if (jmlTiket > 10) {
            diskon = 0.15;
        } else if (jmlTiket > 4) {
            diskon = 0.1;
        }
        potongan = harga * diskon;
        totalBayar = harga - potongan;
        totalTiketTerjual += jmlTiket;
        totalPendapatan += totalBayar;
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

        System.out.println(" Apakah ada pelanggan lain? (y/t): ");
        lanjut = sc.next().charAt(0);

    } while (lanjut == 'y' || lanjut == 'Y');

        System.out.println("Total tiket terjual : " + totalTiketTerjual + " tiket ");
        System.out.println("total : Rp " + totalPendapatan);
        sc.close();
    }
}