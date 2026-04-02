import java.util.Scanner;
public class ip {

public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int jumlahMatkul;
    double totalBobot = 0;
    int totalSKS = 0;

    System.out.print("Masukkan jumlah mata kuliah: ");
    jumlahMatkul = input.nextInt();
    for (int i = 1; i <= jumlahMatkul; i++) {
    System.out.println("\nMata kuliah ke-" + i);
    System.out.print("Masukkan nilai (A/B/C/D/E): ");
    char nilai = input.next().toUpperCase().charAt(0);
    System.out.print("Masukkan jumlah SKS: ");
    int sks = input.nextInt();
    double bobot = 0;

    switch (nilai) {
    case 'A': bobot = 4.0; break;
    case 'B': bobot = 3.0; break;
    case 'C': bobot = 2.0; break;
    case 'D': bobot = 1.0; break;
    case 'E': bobot = 0.0; break;
    default:
    System.out.println("Nilai tidak valid!");
    i--;
    continue;
    }
    totalBobot += bobot * sks;
    totalSKS += sks;
}
    double IP = totalBobot / totalSKS;
    System.out.printf("\nIP Semester: %.2f\n", IP);

    int maksSKS;
    if (IP >= 3.50) {
        maksSKS = 24;
    } else if (IP >= 3.00) {
        maksSKS = 22;
    } else if (IP >= 2.00) {
        maksSKS = 20;
    } else {
        maksSKS = 18;
    }

    System.out.println("Maksimal SKS yang bisa diambil: " + maksSKS);

}
}

