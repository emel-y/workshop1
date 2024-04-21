
public class stringMethods {
    public static void main(String[] args) {


        String name = "Emel Yenİer";

        System.out.println("isminiz " + name.length() + " karakterdir");
        System.out.println("Tümü büyük harf ile isminiz "+ name.toUpperCase());
        System.out.println("Tümü küçük harf ile isminiz "+ name.toLowerCase());
        System.out.println("e karakteri " + name.indexOf("İ"));

        String string1 = "Merhaba";
        String string2 = "merhaba";

        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("İki String eşittir.");
        } else {
            System.out.println("İki String eşit değildir.");
        }





    }
}
