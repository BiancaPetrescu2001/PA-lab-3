package optional;
import java.util.Comparator;


public class CustomComparator implements Comparator<Location> {
    @Override
    public int compare(Location o1, Location o2) {
            return o1.getOpeningHours().compareTo(o2.getOpeningHours());
    }
}
