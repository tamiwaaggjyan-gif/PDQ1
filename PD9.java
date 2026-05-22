import java.util.Scanner;
public class PD9 {

    // 02. Fungsi Cek Ganjil/Genap
    // Fungsi untuk mengecek ganjil atau genap
    public static boolean isGanjil(int angka) {
        return angka % 2 != 0;
    }
    // 03 Fungsi mencari nilai terbesar
    static int getNilaiMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        // Input angka
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        // Menentukan ganjil atau genap
        for (int i = 0; i < n; i++) {
            if (isGanjil(arr[i])) {
                System.out.println(arr[i] + " adalah ganjil");
            } else {
                System.out.println(arr[i] + " adalah genap");
            }

        }        System.out.println(" ");
        System.out.print("Masukkan jumlah bilangan: ");
        int a = input.nextInt();
        int[] array = new int[a];
        // Input array
        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        // Menampilkan nilai terbesar
        System.out.println("Nilai terbesar = " + getNilaiMax(array));
    }
}
