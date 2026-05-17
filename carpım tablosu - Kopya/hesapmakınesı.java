import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi1, sayi2;
        int secim;

        System.out.print("Birinci sayıyı gir: ");
        sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı gir: ");
        sayi2 = input.nextInt();

        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");

        System.out.print("Seçim yap: ");
        secim = input.nextInt();

        switch(secim) {

            case 1:
                System.out.println("Sonuç: " + (sayi1 + sayi2));
                break;

            case 2:
                System.out.println("Sonuç: " + (sayi1 - sayi2));
                break;

            case 3:
                System.out.println("Sonuç: " + (sayi1 * sayi2));
                break;

            case 4:
                System.out.println("Sonuç: " + (sayi1 / sayi2));
                break;

            default:
                System.out.println("Geçersiz seçim!");
        }
    }
}