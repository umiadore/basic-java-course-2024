package homework39.parcel;

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

        Parcel parcel1 = new Parcel("Moscow", "Saint P", 12.5, LocalDateTime.of(2024, 5, 12, 14, 0));
        Parcel parcel2 = new Parcel("Kazan", "Kiyv", 2.8, LocalDateTime.of(2023, 12, 19, 18, 55));
        Parcel parcel3 = new Parcel("Moscow", "Berlin", 8.00, LocalDateTime.of(2024,3 , 22, 9, 0));
        Parcel parcel4 = new Parcel("Hamburg", "Berlin", 12.5, LocalDateTime.of(2024, 1, 18, 22, 0));


        List<Parcel> parcelList = new ArrayList<>();
        parcelList.add(parcel1);
        parcelList.add(parcel2);
        parcelList.add(parcel3);
        parcelList.add(parcel4);


       Parcel berlinDestination = parcelList.stream()
               .filter(parcel -> "Berlin".equals(parcel.getToCity()))
               .max(Comparator.comparing(Parcel::getLocalDateTime))
               .orElse(null);
        if (berlinDestination == null){
            System.out.println("There is no parcels to Berlin");
        } else {
        System.out.println("The Info of the newest - sent parcel to Berlin: " + berlinDestination);



    }
    }
}
