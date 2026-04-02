import java.util.Scanner;

public class sks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input IPS
        System.out.print("Masukkan nilai IPS: ");
        double ips = input.nextDouble();
        int sksMaks;
        // Percabangan sesuai tabel
        if (ips >= 3.50) {
            sksMaks = 24;
        } else if (ips >= 3.00) {
            sksMaks = 22;
        } else if (ips >= 2.00) {
            sksMaks = 20;
        } else {
            sksMaks = 18;
        }

        // Output
        System.out.println("\n===== HASIL =====");
        System.out.printf("IPS Anda: %.2f\n", ips);
        System.out.println("Maksimal SKS yang dapat diambil: " + sksMaks);

        input.close();
    }
}
