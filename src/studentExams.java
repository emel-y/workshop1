import java.util.Scanner;
public class studentExams {
    //6- kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,
    // 1.sınav notu,2.sınav notu,3.sınav notu isteyen
    // ve daha sonra not ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)
    //
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Kaç öğrenci için not hesaplaması yapmak istiyorsunuz? ");
                int ogrenciSayisi = scanner.nextInt();

                for (int i = 1; i <= ogrenciSayisi; i++) {
                    System.out.println("Öğrenci " + i + " için bilgileri girin:");

                    System.out.print("Adı: ");
                    String ad = scanner.next();

                    System.out.print("Soyadı: ");
                    String soyad = scanner.next();

                    System.out.print("1. Sınav Notu: ");
                    double s1 = scanner.nextDouble();

                    System.out.print("2. Sınav Notu: ");
                    double s2 = scanner.nextDouble();

                    System.out.print("3. Sınav Notu: ");
                    double s3 = scanner.nextDouble();

                    // Not ortalamasını hesapla
                    double ortalama = (s1 + s2 + s3) / 3;

                    // Sonucu ekrana yazdır
                    System.out.println("Öğrenci: " + ad + " " + soyad + ", Not Ortalaması: " + ortalama);
                }

                scanner.close();
            }
        }