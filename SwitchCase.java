import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.print("pazartesi");
                break;
            case 2:
                System.out.print("salı");
                break;
            case 3:
                System.out.print("carşamba");
                break;
            case 4:
                System.out.print("perşembe");
                break;
            case 5:
                System.out.print("cuma");
                break;
            case 6:
                System.out.print("cumartesi");
            case 7:
                System.out.print("pazar");
                break;
            default:
                System.out.print("gecersiz gün");
        }
    }
}
