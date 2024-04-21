import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                int tahmin;
                int dogruSayi = 7;

                do {
                    System.out.print("0 ile 10 arasında bir sayı tahmin edin: ");
                    tahmin = scanner.nextInt();

                    if (tahmin != dogruSayi) {
                        System.out.println("Yanlış! Tekrar deneyin.");
                    }
                } while (tahmin != dogruSayi);

                System.out.println("Tebrikler! Doğru sayıyı buldunuz.");

                scanner.close();
    }
}
