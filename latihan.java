import java.util.Scanner;

public class latihan { 
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        /*
        nama barang --> string
        harga barang --> int
        jumlah yang dibeli --> int
        total yang dibayar  --> int
        */

        System.out.println("masukkan nama barang :");
        String namaBarang = myObj.nextLine();
        

        System.out.println("masukkan harga barang :");
        int hargaBarang = myObj.nextInt();
        
        System.out.println("masukkan jumlah yang dibeli :");
        int jumlahYangDibeli = myObj.nextInt();
        

        System.out.println("masukkan total yang dibayar :");
        int totalBayar = hargaBarang * jumlahYangDibeli;

        System.out.println("nama barang : " +namaBarang);
        System.out.println("harga barang : " +hargaBarang);
        System.out.println("jumlah yang dibeli : " +jumlahYangDibeli);
        System.out.println("total bayar : " +totalBayar);   
    }
    
}
