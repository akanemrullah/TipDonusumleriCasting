import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sinifina ait degisken projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Gerekli degiskenler tanimlandi.
        int iNumber = 0, iNumber2 = 0;
        double dNumber = 0.0, dNumber2 = 0.0;

        // Kullanicidan degerler alinip bu degerler degiskenlere atandi.
        System.out.print("Bir tam sayi giriniz: ");
        iNumber = input.nextInt();

        System.out.print("Bir ondalikli sayi giriniz: ");
        dNumber = input.nextDouble();

        // Istenen tip donusumleri yapildi.
        iNumber2 = (int) dNumber;
        dNumber2 = (double) iNumber;

        // Son olarak gerceklestirilen bu donusumler kullaniciya iletildi.
        System.out.println("\nDouble tipinde ki deger int tipinde ki degiskene atandi.\nSonuc: " + iNumber2);
        System.out.println("\nInt tipinde ki deger double tipinde ki degiskene atandi.\nSonuc: " + dNumber2);
    }
}