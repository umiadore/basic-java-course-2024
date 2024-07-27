package homework39.parcel;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.*;

import static java.lang.String.format;

/*
2.2 Создать несколько посылок
2.3 Найти самую новую посылку среди тех, кто отправляется в Берлин
 */
public class ParcelMain {
    public static void main(String[] args) {


        Parcel parcel1 = new Parcel("Moscow", "Saint P", 12.5, Instant.parse("2024-06-01T12:00:00Z"));
        Parcel parcel2 = new Parcel("Kazan", "Kiyv", 2.8, Instant.parse("2024-06-18T19:00:00Z"));
        Parcel parcel3 = new Parcel("Moscow", "Berlin", 8.00, Instant.parse("2024-06-09T14:00:00Z"));
        Parcel parcel4 = new Parcel("Hamburg", "Berlin", 12.5, Instant.parse("2024-06-12T02:00:00Z"));


        List<Parcel> parcelList = new ArrayList<>();
        parcelList.add(parcel1);
        parcelList.add(parcel2);
        parcelList.add(parcel3);
        parcelList.add(parcel4);


       Parcel berlinDestination = parcelList.stream()
               .filter(parcel -> "Berlin".equals(parcel.getToCity()))
               .max(Comparator.comparing(Parcel::getDate))
               .orElse(null);
        if (berlinDestination == null){
            System.out.println("There is no parcels to Berlin");
        } else {
        System.out.println("The Info of the newest - sent parcel to Berlin: " + berlinDestination);



    }
    }
}
