import java.util.Scanner;
public class tugas2 {
    // Prosedur nomor 2
    public static void tampilkanMahasiswa(String nama, String nim, double ipk) {
        System.out.println("\n================================");
        System.out.println("DATA MAHASISWA");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("IPK  : " + ipk);
        System.out.println("================================");
    }
    // Prosedur nomor 3
    public static void cetakTabel(int angka) {
        System.out.println("Tabel Perkalian " + angka);
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input data mahasiswa
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM  : ");
        String nim = input.nextLine();
        System.out.print("Masukkan IPK  : ");
        double ipk = input.nextDouble();

        // Menampilkan data mahasiswa
        tampilkanMahasiswa(nama, nim, ipk);
        // Input angka untuk tabel perkalian
        System.out.print("\nMasukkan angka untuk tabel perkalian : ");
        int angka = input.nextInt();
        // Menampilkan tabel perkalian
        cetakTabel(angka);
    }
}
