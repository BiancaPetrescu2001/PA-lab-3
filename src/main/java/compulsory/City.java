package compulsory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
    private String name;
    private List<Location> locations=new ArrayList<>();


    public City(String name, List<Location> locations) {
        this.name = name;
        this.locations = locations;
    }



    public String getName() {
        return name;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public void addLocation(Location obj)
    {
        locations.add(obj);
    }

    @Override
    public String toString()
    {
        return "City: "+ name+" has the following locations: "+ locations + '\n';
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(locations,name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof City)) {
            return false;
        }
        City cit = (City) obj;
        return Objects.equals(locations,cit.locations) && Objects.equals(name,cit.name);
    }
}
