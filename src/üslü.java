import java.util.Scanner;

public class üslü {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban sayıyı girin: ");
        double taban = scanner.nextDouble();

        System.out.print("Üs sayısını girin: ");
        int us = scanner.nextInt();

        double sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + " üzeri " + us + " = " + sonuc);

        scanner.close();
    }
}
