import java.util.Scanner;
public class fungsi {
    // variabel global
    static int nilai;

    // fungsi tanpa parameter
    static String nilaiHuruf() {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 75 && nilai <= 79) {
            return "B+";
        } else if (nilai >= 65 && nilai <= 74) {
            return "B";
        } else {
            return "Nilai tidak tersedia";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        do {
            System.out.print("Masukkan nilai: ");
            nilai = input.nextInt();
            // Memanggil fungsi untuk mendapatkan nilai huruf
            String hasil = nilaiHuruf();
            System.out.println("Nilai huruf: " + hasil);
            System.out.print("Apakah ingin mengulang? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y'); 
}
}
