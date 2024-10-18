package touristfirm;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TouristFirm firm = new TouristFirm("Tourist firm A", LocalDate.of(2020, 5, 15));

        Tour tour1 = new Tour.TourBuilder()
                .setDestination("Italy")
                .setDuration(7)
                .setPrice(1200.50)
                .build();

        Tour tour2 = new Tour.TourBuilder()
                .setDestination("France")
                .setDuration(5)
                .setPrice(900.00)
                .build();

        firm.addTour(tour1);
        firm.addTour(tour2);

        System.out.println(firm);

        firm.setRegistrationDate(LocalDate.of(2019, 3, 10));

        System.out.println("date of establishment: " + firm);

        System.out.println("update information about firm: " + firm.fullInfo());
    }

}
