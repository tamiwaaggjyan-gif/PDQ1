import java.util.Scanner;
public class ip {

public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int jumlahMatkul;
        double totalNilai = 0;
        int totalSKS = 0;

        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMatkul = input.nextInt();
        input.nextLine(); // buang enter

        for (int i = 1; i <= jumlahMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + i);
            System.out.print("Nilai Huruf (A/B/C/D/E): ");
            char nilaiHuruf = input.next().toUpperCase().charAt(0);
            input.nextLine(); // buang enter
            System.out.print("Jumlah SKS: ");
            int sks = input.nextInt();


            int nilaiAngka = 0;
            String keterangan = "";

            // SWITCH CASE
            switch (nilaiHuruf) {
                case 'A':
                    nilaiAngka = 4;
                    keterangan = "Sangat Baik";
                    break;
                case 'B':
                    nilaiAngka = 3;
                    keterangan = "Baik";
                    break;
                case 'C':
                    nilaiAngka = 2;
                    keterangan = "Cukup";
                    break;
                case 'D':
                    nilaiAngka = 1;
                    keterangan = "Kurang";
                    break;
                case 'E':
                    nilaiAngka = 0;
                    keterangan = "Sangat Kurang";
                    break;
                default:
                    System.out.println("Nilai tidak valid! Ulangi input.");
                    i--;
                    continue;
            }

            System.out.println("Keterangan: " + keterangan);

            totalNilai += nilaiAngka * sks;
            totalSKS += sks;
        }

        // Hitung IPS
        double ips = totalNilai / totalSKS;

        // Tentukan SKS maksimal
        int sksMaks;

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
        System.out.println("\n===== HASIL AKHIR =====");
        System.out.println("Total SKS: " + totalSKS);
        System.out.printf("IPS: %.2f\n", ips);
        System.out.println("Maksimal SKS Semester Depan: " + sksMaks);

        input.close();
    }
}