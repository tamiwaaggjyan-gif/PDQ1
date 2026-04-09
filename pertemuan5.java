import java.util.Scanner; 
public class pertemuan5 {
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
     
        /*
        string : nama barang
        int : harga barang, jumlah barang, jumlah item, subtotal, total belanja
         */

        int hargaBarang, jumlahBarang, jumlahItem, subTotal;
        int totalBelanja = 0;
        String namaBarang;

        System.out.println("masukkan jumlah item : ");
        jumlahItem = myObj.nextInt();

        for (int i = 1; i <= jumlahItem; i++) {
            System.out.println("Masukkan nama barang ke-" + i + " : ");
            namaBarang = myObj.next();

            System.out.println("Masukkan harga barang ke-" + i + " : ");
            hargaBarang = myObj.nextInt();

            System.out.println("Masukkan jumlah barang ke-" + i + " : ");
            jumlahBarang = myObj.nextInt();

            subTotal = hargaBarang * jumlahBarang;
            totalBelanja += subTotal;

            System.out.println("Sub total untuk " + namaBarang + " adalah: " + subTotal);

            switch (i) {
                case 1:
                    System.out.println("anda memasukkan barang pertama adalah " + namaBarang + " dengan harga " + hargaBarang  + " dan jumalah " + jumlahBarang);
                    break;
                case 2:
                    System.out.println("anda memasukkan barang kedua." + namaBarang + " dengan harga " + hargaBarang  + " dan jumalah " + jumlahBarang);
                    break;
                case 3:
                    System.out.println("anda memasukkan barang ketiga. " + namaBarang + " dengan harga " + hargaBarang  + " dan jumalah " + jumlahBarang);
                    break;
                default:
                    System.out.println("anda memasukkan barang ke- " + i + ".");
                  
            }
        }
        System.out.println("Total belanja: " + totalBelanja);
    }
            
    }

