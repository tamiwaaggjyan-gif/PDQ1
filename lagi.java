import java.util.Scanner;
public class lagi {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
    
         // Input jumlah pelanggan
        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = myObj.nextInt();
        myObj.nextLine();

        String[] namaPelanggan = new String[jumlahPelanggan];
        int[] totalBelanja = new int[jumlahPelanggan];
        int i = 0;

        // Perulangan pelanggan (do-while)
        do {
            System.out.println("\nPelanggan ke-" + (i + 1));
            System.out.print("Masukkan nama pelanggan: ");
            namaPelanggan[i] = myObj.nextLine();
            System.out.print("Masukkan jumlah jenis barang: ");
            int jumlahBarang = myObj.nextInt();
            myObj.nextLine();

            // Array barang
            String[] namaBarang = new String[jumlahBarang];
            int[] hargaBarang = new int[jumlahBarang];
            int[] jumlahBeli = new int[jumlahBarang];
            int[] subtotal = new int[jumlahBarang];
            int total = 0;

            // Input barang (for)
            for (int j = 0; j < jumlahBarang; j++) {
                System.out.println("\nBarang ke-" + (j + 1));
                System.out.print("Masukkan nama barang: ");
                namaBarang[j] = myObj.nextLine();
                System.out.print("Masukkan harga barang: ");
                hargaBarang[j] = myObj.nextInt();
                System.out.print("Masukkan jumlah beli: ");
                jumlahBeli[j] = myObj.nextInt();
                myObj.nextLine();
                // Hitung subtotal
                subtotal[j] = hargaBarang[j] * jumlahBeli[j];
                // Tambah ke total
                total += subtotal[j];
            }
            // Tampilkan daftar barang pelanggan
            System.out.println("\n===== Detail Belanja " + namaPelanggan[i] + " =====");
            for (int j = 0; j < jumlahBarang; j++) {
                System.out.println("Nama Barang   : " + namaBarang[j]);
                System.out.println("Harga         : Rp " + hargaBarang[j]);
                System.out.println("Jumlah Beli   : " + jumlahBeli[j]);
                System.out.println("Subtotal      : Rp " + subtotal[j]);
                System.out.println("----------------------");
            }
            // Simpan total belanja
            totalBelanja[i] = total;
            i++;
        } while (i < jumlahPelanggan);
        
        // Tampilkan semua total pelanggan
        System.out.println("\n===== STRUK SEMUA PELANGGAN =====");
        for (int k = 0; k < jumlahPelanggan; k++) {
            System.out.println("Nama Pelanggan : " + namaPelanggan[k]);
            System.out.println("Total Belanja  : Rp " + totalBelanja[k]);
            if (totalBelanja[k] >= 40000) {
                System.out.println("Status Bonus   : Dapat Diskon");
            } else {
                System.out.println("Status Bonus   : Tidak Ada Diskon");
            }
            System.out.println("======================");
        }
    }
}