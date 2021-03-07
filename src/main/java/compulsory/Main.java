package compulsory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hotel l1 = new Hotel("Hotel");
        Museum l2 = new Museum("Museum A");
        Museum l3 = new Museum("Museum B");
        Church l4 = new Church("Church A");
        Church l5 = new Church("Church B");
        Restaurant l6 = new Restaurant("Restaurant");
        l1.setDist(l2, 10);
        l1.setDist(l3, 50);
        l2.setDist(l3, 20);
        l3.setDist(l2, 20);
        l2.setDist(l4, 20);
        l2.setDist(l5, 10);
        l3.setDist(l4, 20);
        l4.setDist(l5, 30);
        l5.setDist(l4, 30);
        l4.setDist(l6, 10);
        l5.setDist(l6, 20);

        List<Location> locationList = new ArrayList<>();
        locationList.add(l1);
        locationList.add(l2);
        locationList.add(l3);
        locationList.add(l4);
        locationList.add(l5);
        locationList.add(l6);


        City city = new City("New York", locationList);

        System.out.println("The city and location list are: " + city);

        Collections.sort(locationList);
        System.out.println("The natural ordering of location list gilen by their names is: \n" + locationList);

        System.out.println("The distance map is: ");
        for (Location location : locationList) {
            for (Location name: location.getDist().keySet()){
                String key = name.getName();
                String lalue = location.getDist().get(name).toString();
                System.out.println(location.getName()+ "->" + key + "=" + lalue);
            }
        }


    }
}