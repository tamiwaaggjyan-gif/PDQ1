import java.util.Scanner;
public class lat7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int hari ;
        int transaksiPerHari ;
        int jumlahPerTransaksi ;
        int totalPendapatan = 0;

        System.out.print("Masukkan jumlah hari: ");
        hari = myObj.nextInt();

        System.out.print("Masukkan jumlah transaksi per hari: ");
        transaksiPerHari = myObj.nextInt();

        System.out.print("Masukkan jumlah per transaksi: ");
        jumlahPerTransaksi = myObj.nextInt();

        System.out.println(" ");
        // Loop untuk hari
        for (int i = 1; i <= hari; i++) {
            int totalHarian = 0;

            // Nested loop untuk transaksi per hari
            for (int j = 1; j <= transaksiPerHari; j++) {
                totalHarian += jumlahPerTransaksi;
                System.out.println("Hari ke-" + i + ", Transaksi ke-" + j + " = " + jumlahPerTransaksi);
            }
            System.out.println("Total hari ke-" + i + " = " + totalHarian);
            System.out.println(" ");
            totalPendapatan += totalHarian;
        }
        System.out.println("Total pendapatan selama 3 hari = " + totalPendapatan);
    }
}