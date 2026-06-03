import java.util.Scanner;
public class PDAsl {
// variabel class-level/ variabel global >> variabel yang bisa dibaca disemua block
// static double r

    // fungsi hitung luas lingkaran
    // phi * r * r >> double/float

    // paramenter >> variabel tampung sementara milik method tsb
    // parameter = isi variabel dinamis (double r) >> contoh parameter
    static double LuasLingkaran(double r) {
        double phi = 3.14;
        double Luas = phi * r * r;
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah : " + Luas); // jika ada sout dalam method
        return Luas; // Mengembalikan hasil luas lingkaran
    }
    //public static void main(String[] args) {
        // panggil method luas lingkaran
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran : ");
        double r = input.nextDouble();
        double luas = LuasLingkaran(r);
        // 1. kalau dalam fungsi tidak ada println, maka kita buat sout di main untuk menampilkan hasilnya
        //System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah : " + luas);
        // 2. jika dalam fungsi sudah ada println, maka kita cukup panggil methodnya saja tanpa sout di main
        //LuasLingkaran(r);

    }

    // boleh tanpa paramenter
    // overloading function >> membuat funsi dengan nama fungsi yang sama namun jumlah paramenter berbeda
    // versi tanpa parameter
    //static double LuasLingkaran() {
        //luas = 3.14 * r * r;
        //System.out.print("Luas lingkaran dengan jari-jari " + r + " adalah : " + luas);
        //return 0.0; // Mengembalikan hasil luas lingkaran
    
    // fungsi ganjil genap
