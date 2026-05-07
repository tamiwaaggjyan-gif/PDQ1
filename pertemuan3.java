import java.util.Scanner;

public class pertemuan3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Daftar member
        String namaMember = "", alamatMember = "", noHPmember = "";
        String jawab = "";

        // Transaksi belanja
        String namaBarang = "";
        double harga = 0.0, jumlah = 0.0;
        double total = 0.0, diskonBelanja = 0.0, diskonMember = 0.0, grandTotal = 0.0;

        // Tanya daftar member
        System.out.print("Apakah ingin mendaftar member? (Y/T): ");
        jawab = myObj.nextLine();

        boolean isMember = false;

        // Input member
        if (jawab.equalsIgnoreCase("Y")) {
            isMember = true;

            System.out.print("Nama anda: ");
            namaMember = myObj.nextLine();

            System.out.print("Alamat anda: ");
            alamatMember = myObj.nextLine();

            System.out.print("No HP anda: ");
            noHPmember = myObj.nextLine();
        }

        // Lanjut belanja
        System.out.print("Ingin lanjut berbelanja? (Y/T): ");
        jawab = myObj.nextLine();

        if (jawab.equalsIgnoreCase("Y")) {
            System.out.print("Nama barang: ");
            namaBarang = myObj.nextLine();

            System.out.print("Harga barang: ");
            harga = myObj.nextDouble();

            System.out.print("Jumlah beli: ");
            jumlah = myObj.nextDouble();

            // Hitung total
            total = harga * jumlah;

            // Diskon berdasarkan total belanja
            if (total > 300000) {
                diskonBelanja = total * 0.15;
            } else if (total > 100000) {
                diskonBelanja = total * 0.10;
            } else {
                diskonBelanja = 0;
            }

            // Diskon member 2%
            if (isMember) {
                diskonMember = total * 0.02;
            }

            // Grand total
            grandTotal = total - diskonBelanja - diskonMember;

            // Output struk
            System.out.println("\n===== STRUK BELANJA =====");
            System.out.println("Nama Barang   : " + namaBarang);
            System.out.println("Harga Barang  : " + harga);
            System.out.println("Jumlah Beli   : " + jumlah);
            System.out.println("Total         : " + total);
            System.out.println("Diskon Belanja: " + diskonBelanja);
            System.out.println("Diskon Member : " + diskonMember);
            System.out.println("Grand Total   : " + grandTotal);

            // Data member jika member
            if (isMember) {
                System.out.println("\n===== DATA MEMBER =====");
                System.out.println("Nama   : " + namaMember);
                System.out.println("Alamat : " + alamatMember);
                System.out.println("No HP  : " + noHPmember);
            }
        } else {
            System.out.println("Terima kasih.");
        }
        myObj.close();
    }
}