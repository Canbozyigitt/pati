import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) girin: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Hatalı veri kontrolü
        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            // Mesafe başına ücret
            double birimFiyat = 0.10;

            // İlk olarak uçuşun toplam fiyatını hesaplayın
            double toplamFiyat = mesafe * birimFiyat;

            // İndirimlerin uygulanması
            if (yas < 12) {
                // 12 yaşından küçükse %50 indirim
                toplamFiyat *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                // 12-24 yaş arasındaysa %10 indirim
                toplamFiyat *= 0.9;
            } else if (yas >= 65) {
                // 65 yaşından büyükse %30 indirim
                toplamFiyat *= 0.7;
            }

            if (yolculukTipi == 2) {
                // Gidiş dönüşse %20 indirim
                toplamFiyat *= 0.8;
            }

            System.out.println("Toplam Bilet Fiyatı: " + toplamFiyat + " TL");
        }

        scanner.close();
    }
}
