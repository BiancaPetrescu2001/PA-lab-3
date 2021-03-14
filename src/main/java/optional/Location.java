package optional;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

abstract public class Location implements Comparable<Location>, Visitable {

    private String name;
    private Map<Location, Integer> distance = new HashMap<>();
    protected LocalTime openingHours;
    protected LocalTime closingHours;


    public Location(String name) {
        this.name = name;
        this.openingHours = LocalTime.of(23, 59, 59);
    }

    public Location(String name, Map<Location, Integer> distance) {
        this.name = name;
        this.distance = distance;
        this.openingHours = LocalTime.of(23, 59, 59);
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getOpeningHours() {
        return openingHours;
    }

    public LocalTime getClosingHours() {
        return closingHours;
    }

    public void setOpeningHours(LocalTime openingHours) {
        this.openingHours = openingHours;
    }

    public void setClosingHours(LocalTime closingHours) {
        this.closingHours = closingHours;
    }

    public String getName() {
        return this.name;
    }

    public void setDist(Location loc, int value) {
        distance.put(loc, value);
    }

    public Map<Location, Integer> getDist() {
        return distance;
    }


    @Override
    public int compareTo(Location o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {

        return "The Location is called: " + name;
    }


}
