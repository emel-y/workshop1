import java.util.Scanner;
public class shoppingCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç ürün almak istiyorsunuz? ");

        int quantity = scanner.nextInt();

        double totalPrice = 0;

        for (int i = 1; i <= quantity; i++) {
            System.out.print("Ürün " + i + " fiyatı: ");
            double price = scanner.nextDouble();

            totalPrice += price;
        }

        System.out.println("Toplam alışveriş tutarı: " + totalPrice);

        scanner.close();
    }
}