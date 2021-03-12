package optional;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hotel v1 = new Hotel("Hotel");
        Museum v2 = new Museum("Museum A");
        Museum v3 = new Museum("Museum B");
        Church v4 = new Church("Church A");
        Church v5 = new Church("Church B");
        Restaurant v6 = new Restaurant("Restaurant");
        v1.setDist(v2, 10);
        v1.setDist(v3, 50);
        v2.setDist(v3, 20);
        v3.setDist(v2, 20);
        v2.setDist(v4, 20);
        v2.setDist(v5, 10);
        v3.setDist(v4, 20);
        v4.setDist(v5, 30);
        v5.setDist(v4, 30);
        v4.setDist(v6, 10);
        v5.setDist(v6, 20);

        List<Location> locationList = new ArrayList<>();
        locationList.add(v1);
        locationList.add(v2);
        locationList.add(v3);
        locationList.add(v4);
        locationList.add(v5);
        locationList.add(v6);

    //    v1.setVisitingHours(Pair(LocalTime.of(10,12,13), LocalTime.of(10,34,8)));
        v4.setOpeningHours(LocalTime.of(10,12,13));
        v4.setClosingHours(LocalTime.of(10,34,8));



        City city = new City("Chicago", locationList);

        System.out.println("The city and location list are: " + city);

        Collections.sort(locationList);
        System.out.println("The natural ordering of location list given by their names is: \n" + locationList);

        System.out.println("The cost map is: ");
        for (Location location : locationList) {
            for (Location name: location.getDist().keySet()){
                String key = name.getName();
                String value = location.getDist().get(name).toString();
                System.out.println(location.getName()+ "->" + key + "=" + value);
            }
        }

        city.visitNotPay();
        Duration diff=(Visitable.getVisitingDuration(v4.getOpeningHours(), v4.getClosingHours()));
        String hms = String.format("%d:%02d",
                diff.toHours(),
                diff.toMinutes() );
        System.out.println(hms);


        List<Location> wantedLocations = new ArrayList<>();
        wantedLocations.add(v4);
        wantedLocations.add(v3);

        TravelPlan myTravel=new TravelPlan(city,wantedLocations);


        System.out.println(myTravel.getVisitedCity());
        System.out.println(myTravel.getLocations());

        city.buildDistanceMatrix();
        System.out.println(city.getMinimumDistance(0,1));

        System.out.println(city.getLocations().get(0).getDist().get(city.getLocations().get(1)));

    }
}