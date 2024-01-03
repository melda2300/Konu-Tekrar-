import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Para değerini giriniz: ");
        double price = scanner.nextDouble();
        double kdv;

        if (price <= 0 || price >= 1000) {
            kdv = price * 0.08;
        } else {
            kdv = price * 0.18;
        }

        double kdvliFiyat = price + kdv;
        System.out.println("KDV'siz Fiyat: " + price);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV tutarı: " + kdv);
    }
}
