import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        /*
            buatlah program seperti dibawah ini:
            pemesan tiket surabayaZoo
            1. input data
            2. input jumlah beli
            3. lihat total bayar
            4. keluar program

            pada menu 1. input data, terdiri atas kategori dan harga dengan isian bebas dari admin.
            array 1D
            
            kemudian pada menu 2. mengisi jumlah tiket yang dibeli.

            pada menu 3. dilakukan menghitung total bayar dari jumlah tiket yang dibeli
            (sekaligus print total)
        */
            //deklarasi variabel
            //kategori & harga isian bebas, total, jumlah beli
            String [] kategori = null;
            int [] harga = null;
            int [] jumlahBeli = null;
            int total=0, pilihMenu=0, jmlhkategori=0;
 
            //menu loop
        do {
            System.out.println("Pemesanan tiket bonbin");
            System.out.println("1. Input kategori dan harga");
            System.out.println("2. Input jumlah tiket yang dibeli");
            System.out.println("3. Total bayar");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilihMenu = myObj.nextInt();

            switch (pilihMenu) {
                case 1:
                myObj.nextLine();   
                System.out.print("jumlah kategori yang diisi: ");
                    jmlhkategori = myObj.nextInt();
                    myObj.nextLine();
                    kategori = new String[jmlhkategori];
                    harga = new int[jmlhkategori];
                    jumlahBeli = new int[jmlhkategori];

                    for (int i = 0 ; i < kategori.length; i++) {
                        System.out.print("Nama Kategori ke- " + (i +1) + ": ");
                        kategori[i] = myObj.nextLine();
                        System.out.print("Harga : ");
                        harga[i] = myObj.nextInt();
                        myObj.nextLine();
                    }
                    for (int i=0; i< kategori.length; i++) {
                        System.out.println("Kategori ke-" + (i+1));
                        System.out.println("Kategori: " + kategori[i]);
                        System.out.println("Harga ke" +(i+1)+" : " + harga[i]);
                    }
                    break;
                case 2:
                    if (kategori == null) {
                        System.out.println("Silakan input kategori dan harga terlebih dahulu (Menu 1)");
                        break;
                    }
                    
                    System.out.println("\n=== Pilihan Kategori ===");
                    for (int i = 0; i < kategori.length; i++) {
                        System.out.println((i+1) + ". " + kategori[i] + " - Rp " + harga[i]);
                    }
                    
                    boolean inputLagi = true;
                    while (inputLagi) {
                        System.out.println("\n=== Input Jumlah Tiket ===");
                        for (int i = 0; i < kategori.length; i++) {
                            System.out.print("Jumlah tiket " + kategori[i] + ": ");
                            jumlahBeli[i] = myObj.nextInt();
                            myObj.nextLine();
                        }
                        
                        System.out.print("\nIngin input tiket lagi? (y/n): ");
                        String jawab = myObj.nextLine();
                        if (jawab.equalsIgnoreCase("n")) {
                            inputLagi = false;
                        }
                    }
                    break;
                case 3:
                    if (kategori == null) {
                        System.out.println("Silakan input kategori dan harga terlebih dahulu (Menu 1)");
                        break;
                    }
                    
                    System.out.println("== Total Bayar == ");
                    total = 0;
                    for (int i = 0; i < kategori.length; i++) {
                        int subtotal = jumlahBeli[i] * harga[i];
                        System.out.println(kategori[i] + ": " + jumlahBeli[i] + " x Rp " + harga[i] + " = Rp " + subtotal);
                        total += subtotal;
                    }
                    System.out.println("Total Pembayaran: Rp " + total);
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true); 
    }
}