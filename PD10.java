import java.util.Scanner;
public class PD10 {
    static int LuasPersegiPanjang(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }
    static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
    static int Hitung(int a, int b) {
        int hasil = a + b;
        return hasil;
    }
    static double Hitung(double a, double b) {
        double hasil = a * b;
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = input.nextInt();
        int luas = LuasPersegiPanjang(panjang, lebar);
        System.out.println("Luas persegi panjang adalah : " + luas);
        System.out.println(" ");


        System.out.print("Masukkan bilangan untuk menghitung faktorial : ");
        int n = input.nextInt();
        int factorial = Factorial(n);
        System.out.println("Faktorial dari " + n + " adalah : " + factorial);
        System.out.println(" ");

        System.out.print("Masukkan bilangan A : ");
        int a = input.nextInt();            
        System.out.print("Masukkan bilangan B : ");
        int b = input.nextInt();
        int hasil = Hitung(a, b);
        System.out.println("Hasil penjumlahan " + a + " + " + b + " adalah : " + hasil);
        System.out.println(" ");
        
        System.out.print("Masukkan bilangan A : ");
        double c = input.nextDouble();  
        System.out.print("Masukkan bilangan B : ");
        double d = input.nextDouble();
        double hasilKali = Hitung(c, d);
        System.out.println("Hasil perkalian " + c + " * " + d + " adalah : " + hasilKali);
        System.out.println(" ");
        input.close();

    }
}
