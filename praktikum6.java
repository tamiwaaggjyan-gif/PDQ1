import java.util.Scanner;
public class praktikum6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
       
        System.out.println("masukkan angka : ");
        int x = myObj.nextInt();
        
        for (int i = 0; i < x; i++) { 
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= x; i++) { 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
        System.out.println();
        for (int i = x; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= x; i++) { 

            for (int j = 1; j <= x - i; j++){
                System.out.print(" ");
            }   
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
     } 
}