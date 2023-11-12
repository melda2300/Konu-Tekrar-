import java.util.Scanner;

public class LokumOdev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayı giriniz: ");
        int alan1 = scanner.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        int sayı1 = scanner.nextInt();
        System.out.println(alan1 + sayı1);
        System.out.println(alan1 * sayı1);
        System.out.println(alan1 / sayı1);
        System.out.println(alan1 - sayı1);
        System.out.println("--------------------------------------");
        scanner = new Scanner(System.in);
        System.out.print("1. üçgenin alanını giriniz: ");
        alan1 = scanner.nextInt();
        System.out.print("2. üçgenin alanına giriniz: ");
        double alan2 = (double)scanner.nextInt();
        System.out.print("3. üçgenin alanını giriniz: ");
        int alan3 = scanner.nextInt();
        double alanlar = (double)alan1 + alan2 + (double)alan3;
        System.out.println(alanlar);
        String sifre1 = "123456789";
        Scanner scr = new Scanner(System.in);
        System.out.println("adınızı giriniz:");
        String ad = scr.next();
        System.out.println("sifreyi giriniz");
        String şıfre1 = scr.next();
        if (ad.equalsIgnoreCase(ad) == şıfre1.equalsIgnoreCase(sifre1)) {
            System.out.println("başarılı");
        } else {
            System.out.println("hatalı giriş");
        }
    }
}
