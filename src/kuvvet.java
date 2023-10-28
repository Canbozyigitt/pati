import java.util.Scanner;

public class kuvvet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int kuvvet = 1;
        int sonuc = 1;

        while (sonuc <= sayi) {
            System.out.println("2^" + kuvvet + " = " + sonuc);
            kuvvet++;
            sonuc = (int) Math.pow(2, kuvvet);
        }

        scanner.close();
    }
}
