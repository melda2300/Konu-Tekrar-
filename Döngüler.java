
public class Döngüler {
    public static void main(String[] args) {

        int count;
        for(count = 1; count <= 5; ++count) {
            System.out.println("artmak =" + count);
        }

        System.out.println("---------------------------");

        do {
            System.out.println("artmak = " + count);
            ++count;
        } while(count <= 5);

        System.out.println("-----------------");
        int b = 10;

        int i;
        for(i = 1; i <= b; ++i) {
            System.out.println("arttırma= " + i);
            if (i == b) {
                System.out.println("bulundu=" + i);
            }
        }

        for(i = 1; i <= 10; ++i) {
            for(int s = 1; s <= 10; ++s) {
                System.out.printf("%4d", i * s);
            }

            System.out.println();
        }

        }
    }
