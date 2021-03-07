package compulsory;
import java.util.HashMap;
import java.util.Map;

abstract public class Location implements Comparable<Location>{

    private String name;
    private Map<Location,Integer> distance=new HashMap<>();

    public Location(String name) {
        this.name = name;
    }

    public Location(String name, Map<Location, Integer> distance) {
        this.name = name;
        this.distance = distance;
    }

    public void setName(String name) {
        this.name=name;
    }


    public String getName(){
        return this.name;
    }

    public void setDist(Location loc,int value)
    {
        distance.put(loc,value);
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

        return "The Location is called: "+name;
    }


}
