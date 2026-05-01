import java.util.Scanner;
public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = new String[5];
        int [] nilai = new int[5];
        int total = 0;
        double rataRata;
        int max, min;

        // input data mahasiswa
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Data mahasiswa ke- " + (i + 1));

            System.out.println("Masukkan nama : ");
            nama[i] = input.nextLine();

            System.out.println("Maukkan nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine(); //membersihkan enter

            total += nilai[i];
            System.out.println();
        }   
        // mencari nilai terbesar dan terkecil
        
     }
}
