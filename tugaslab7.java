import java.util.Scanner;
public class tugaslab7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        // Input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int n = myObj.nextInt();
        int[] arr = new int[n];
        // Input isi array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            arr[i] = myObj.nextInt();
        }
        // 1. Cari Nilai Tertinggi
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nNilai tertinggi: " + max);
        // 2. Searching
        System.out.print("\nMasukkan angka yang dicari: ");
        int cari = myObj.nextInt();
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == cari) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Angka ditemukan dalam array");
        } else {
            System.out.println("Angka tidak ditemukan");
        }
        // 3. Membalik Array
        System.out.println("\nArray setelah dibalik:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        myObj.close();
    }
}