import java.util.Scanner;

public class faktoriyel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktoriyel hesaplanacak sayıyı girin: ");
        int sayi = scanner.nextInt();

        long faktoriyel = 1; // Faktoriyel hesaplama için başlangıç değeri

        if (sayi < 0) {
            System.out.println("Negatif sayıların  faktoriyeli hesaplanamaz...");
        }  else {
            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
            }
            System.out.println(sayi + "! = " + faktoriyel);
        }

        scanner.close();
    }
}
