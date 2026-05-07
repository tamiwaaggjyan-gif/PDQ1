import java.util.Scanner;
public class cobaCoba {
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        //input jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMahasiswa = myObj.nextInt();
        myObj.nextLine();
        
        String[] nama = new String[jumlahMahasiswa];
        int[] totalNilai = new int[jumlahMahasiswa];
        double[] rataRata = new double[jumlahMahasiswa];

        // Input data tiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama mahasiswa: ");
            nama[i] = myObj.nextLine();
            System.out.print("Masukkan jumlah nilai " + nama[i] + ": ");
            int jumlahNilai = myObj.nextInt();
            int[] nilai = new int[jumlahNilai];
            int total = 0;

            // Input nilai mahasiswa
            for (int j = 0; j < jumlahNilai; j++) {
                System.out.print("Nilai ke-" + (j + 1) + ": ");
                nilai[j] = myObj.nextInt();
                total += nilai[j];
            }
            // Hitung rata-rata mahasiswa
            rataRata[i] = (double) total / jumlahNilai;
            totalNilai[i] = total;
            myObj.nextLine();
        }
        // Output hasil semua mahasiswa
        System.out.println("\n===== HASIL NILAI MAHASISWA =====");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nama       : " + nama[i]);
            System.out.println("total nilai : " + totalNilai[i]);
            System.out.println("Rata-rata  : " + rataRata[i]);
            if (rataRata[i] >= 75) {
                System.out.println("Status     : Lulus");
            } else {
                System.out.println("Status     : Tidak Lulus");
            }
            System.out.println("----------------------");
        }
    }
}
