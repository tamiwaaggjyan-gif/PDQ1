import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int nilai , jumlah = 0;

        do{
            System.out.print("masukkan nilai mahasiswa : ");
            nilai = myObj.nextInt();

            if(nilai >= 0){
                jumlah++;
            }
        } while (nilai >= 0);
        
        System.out.println("jumlah nilai yang di masukkan : " + jumlah);
    }
}