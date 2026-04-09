import java.util.Scanner; 
public class pertemuan3 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        //Daftar member
        String namaMember="", alamatMember="", noHPmember="";
        String jawab="";

        //untuk transaksi belanja
        String namaBarang="";
        double harga=0.0, jumlah=0.0, total=0.0, diskon=0.0, grandTotal=0.0;
        
        //ditanyakan memeber atau bukan
        //berikan teks input
        System.out.println("apakah ingin mendaftar member? (Y/T) ");
        jawab = myObj.nextLine();

        //cek jawaban user,jawaban Y atau T menggunakan if
        if (jawab.equalsIgnoreCase("y")) {
            System.out.println("nama anda: ");
            namaMember = myObj.nextLine();
            System.out.println("alamat anda : ");
            alamatMember = myObj.nextLine();
            System.out.println("no HP anda : ");
            noHPmember = myObj.nextLine();

            System.out.println("ingin lanjut berbelanja? (y/t)");
            jawab = myObj.nextLine();
            if (jawab.equalsIgnoreCase("y")){
                System.out.println("nama barang : ");
                namaBarang = myObj.nextLine();
                System.out.println("harga : ");
                harga = myObj.nextDouble();
                System.out.println("jumlah beli : ");
                jumlah = myObj.nextDouble();

                System.out.println();

                total = harga * jumlah;
                System.out.println("total : " + total);
            if (jawab.equalsIgnoreCase("t")){
                System.out.println("nama barang : ");
                namaBarang = myObj.nextLine();
                System.out.println("harga : ");
                harga = myObj.nextDouble();
                System.out.println("jumlah beli : ");
                jumlah = myObj.nextDouble();
            }
                
            } 
        } else {
            System.out.println("selamat belanja");

        }


        // input data pelanggan
        System.out.println("Total belanja: ");
        double totalBelanja = myObj.nextDouble();

        System.out.println("Apakah member? (Ya/Tidak): ");
        String inputMember = myObj.next();
        boolean isMember = inputMember.equalsIgnoreCase("Ya");

        double diskonBelanja;
        if (totalBelanja > 300000) {
            diskonBelanja = 0.15 * totalBelanja;
        } else if (totalBelanja > 100000) {
            diskonBelanja = 0.10 * totalBelanja;
        } else {
            diskonBelanja = 0;
        }
        
        if (isMember) {
            diskonBelanja = 0.02 + totalBelanja;
        }




    }
}
