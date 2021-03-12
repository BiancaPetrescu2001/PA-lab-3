package optional;
import java.util.List;

public class TravelPlan {
    City visitedCity;
    List<Location> locations;

    public TravelPlan(City visitedCity) {
        this.visitedCity = visitedCity;
    }

    public TravelPlan(City visitedCity, List<Location> locations) {
        this.visitedCity = visitedCity;
        this.locations = locations;
    }

    public City getVisitedCity() {
        return visitedCity;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setVisitedCity(City visitedCity) {
        this.visitedCity = visitedCity;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
