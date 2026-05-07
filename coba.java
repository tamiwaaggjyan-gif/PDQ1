import java.util.Scanner;
public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input jumlah mahasiswa
        //System.out.print("masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine(); // membersihkan enter setelah input jumlah mahasiswa
        
        String[] nama = new String[jumlahMahasiswa];
        int [] nilai = new int[jumlahMahasiswa];
        int total = 0;
        double rataRata;
        int max, min;

        // input data mahasiswa
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Data mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan nama : ");
            nama[i] = input.nextLine();
            System.out.print("Maukkan nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine(); //membersihkan enter
            total += nilai[i];
            System.out.println();
        }   
        // mencari nilai terbesar dan terkecil
        max = nilai[0];
        min = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        // menghitung rata-rata
        rataRata = (double) total / nama.length;
        // menampilkan data
        System.out.println("=== Data mahasiswa ===");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama: " + nama[i] + ", Nilai: " + nilai[i]);
        }
        System.out.println("Total Nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai Terbesar: " + max);
        System.out.println("Nilai Terkecil: " + min);
    }
}