import java.util.Scanner;

public class Sınav {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("isminizi giriniz: ");
        String ogrençismi = scan.next();
        System.out.print("1.sınav notu: ");
        double not1 = scan.nextDouble();
        System.out.print("2. sınav notu: ");
        double not2 = scan.nextDouble();
        System.out.print("final sınav notunu giriniz: ");
        double fınal = scan.nextDouble();
        double toplamnot = not1 + not2 + fınal;
        double gecmepuanı = toplamnot / 3.0;
        char grade;
        if (gecmepuanı >= 90.0) {
            grade = 'A';
        } else if (gecmepuanı >= 80.0) {
            grade = 'B';
        } else if (gecmepuanı >= 70.0) {
            grade = 'C';
        } else if (gecmepuanı >= 60.0) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("not raporu: " + ogrençismi);
        System.out.println("gecme puanı: " + gecmepuanı);
        System.out.println("yüzdelik puan: " + toplamnot);
        System.out.println("harf notu: " + grade);
        if (grade == 'f') {
            System.out.println("mallesef dersi gecemediniz");
        } else {
            System.out.println("tebrikler dersi gectiniz");
        }
    }
}
