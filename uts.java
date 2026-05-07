import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input nama mahasiswa
        System.out.print("Masukkan nama mahasiswa : ");
        String nama = input.nextLine();

        // input jumlah pertemuan
        int totalPertemuan;

        do {
            System.out.print("Masukkan jumlah total pertemuan (14-16): ");
            totalPertemuan = input.nextInt();

            if (totalPertemuan < 14 || totalPertemuan > 16) {
                System.out.println("Jumlah pertemuan harus 14 sampai 16!");
            }

        } while (totalPertemuan < 14 || totalPertemuan > 16);

        input.nextLine();

        // array
        String[] tanggal = new String[totalPertemuan];
        int[] kehadiran = new int[totalPertemuan];

        // input data
        System.out.println("\n=== INPUT DATA KEHADIRAN ===");

        for (int i = 0; i < totalPertemuan; i++) {

            System.out.println("\nPertemuan ke-" + (i + 1));

            System.out.print("Tanggal pertemuan : ");
            tanggal[i] = input.nextLine();

            System.out.print("Kehadiran (1=Hadir, 0=Tidak Hadir) : ");
            kehadiran[i] = input.nextInt();
            input.nextLine();

            // validasi
            while (kehadiran[i] != 1 && kehadiran[i] != 0) {
                System.out.println("Input hanya boleh 1 atau 0");

                System.out.print("Kehadiran (1=Hadir, 0=Tidak Hadir) : ");
                kehadiran[i] = input.nextInt();
                input.nextLine();
            }
        }

        // menghitung total hadir
        int totalHadir = 0;
        int totalTidakHadir = 0;

        for (int i = 0; i < totalPertemuan; i++) {

            if (kehadiran[i] == 1) {
                totalHadir++;
            } else {
                totalTidakHadir++;
            }
        }

        // hitung persentase
        double persentase = ((double) totalHadir / totalPertemuan) * 100;

        // status
        String status;

        if (persentase >= 75) {
            status = "Memenuhi syarat";
        } else {
            status = "Tidak memenuhi syarat";
        }

        // output
        System.out.println("\n===== DATA KEHADIRAN MAHASISWA =====");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jumlah Pertemuan : " + totalPertemuan);

        System.out.println("\n===== DETAIL KEHADIRAN =====");

        for (int i = 0; i < totalPertemuan; i++) {

            System.out.println("Pertemuan ke-" + (i + 1));
            System.out.println("Tanggal : " + tanggal[i]);

            if (kehadiran[i] == 1) {
                System.out.println("Kehadiran : Hadir");
            } else {
                System.out.println("Kehadiran : Tidak Hadir");
            }

            System.out.println("-------------------------");
        }

        // hasil akhir
        System.out.println("\n===== HASIL EVALUASI =====");
        System.out.println("Total Hadir        : " + totalHadir);
        System.out.println("Total Tidak Hadir  : " + totalTidakHadir);
        System.out.println("Persentase         : " + persentase + "%");
        System.out.println("Status             : " + status);
    }
}

        