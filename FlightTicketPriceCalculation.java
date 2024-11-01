package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class FlightTicketPriceCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km, age, travelType;
        final double perKm = 0.10;

        System.out.print("Enter the distance in km: ");
        km = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println();
        System.out.println("1-One Way, 2-Round Trip");
        System.out.println();

        System.out.print("Please choose your travel type (1 or 2): ");
        travelType = input.nextInt();

        if (km > 0) {
            if (age > 0 && age < 12) {
                switch (travelType) {
                    case 1:
                        System.out.println();
                        System.out.println("Total Cost Is = " + km * perKm * 0.5 + (" $"));
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Total Cost Is = " + (km * perKm * 0.5) * 0.8 + (" $"));
                        break;
                    default:
                        System.out.println();
                        System.out.println("You have entered an invalid trip type.");
                        break;
                }

            } else if (age > 11 && age < 25) {
                switch (travelType) {
                    case 1:
                        System.out.println();
                        System.out.println("Total Cost Is = " + km * perKm * 0.9 + (" $"));
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Total Cost Is = " + (km * perKm * 0.9) * 0.8 + (" $"));
                        break;
                    default:
                        System.out.println();
                        System.out.println("You have entered an invalid trip type.");
                        break;
                }

            } else if (age > 24 && age < 65) {
                switch (travelType) {
                    case 1:
                        System.out.println();
                        System.out.println("Total Cost Is = " + km * perKm + (" $"));
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Total Cost Is = " + (km * perKm) * 0.8 + (" $"));
                        break;
                    default:
                        System.out.println();
                        System.out.println("You have entered an invalid trip type.");
                        break;
                }

            } else if (age > 64){
                switch (travelType) {
                    case 1:
                        System.out.println();
                        System.out.println("Total Cost Is = " + km * perKm * 0.7 + (" $"));
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Total Cost Is = " + (km * perKm * 0.7) * 0.8 + (" $"));
                        break;
                    default:
                        System.out.println("You have entered an invalid trip type.");
                        break;
                }

            } else if (age == 0){
                System.out.println("Free Ticket");
            } else {
                System.out.println("You have entered an invalid age.");
            }


        } else {
            System.out.println("You entered an invalid distance.");
        }
    }
}


/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
