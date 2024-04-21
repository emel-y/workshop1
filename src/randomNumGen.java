import java.util.Scanner;
import java.util.Random;
public class randomNumGen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rightAnswer = random.nextInt(10) + 1;

        int guess;
        boolean guessedRight = false;
        System.out.println("1 ile 10 arasında bir sayı tahmin edin.");

        while (!guessedRight) {
            System.out.print("Tahmininiz: ");
            guess = scanner.nextInt();

            if (guess == rightAnswer) {
                System.out.println("Tebrikler! Doğru sayıyı buldunuz.");
                guessedRight = true;
            } else {
                System.out.println("Yanlış! Tekrar deneyin.");
            }
        }

        scanner.close();
    }
}
