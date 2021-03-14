package optional;

import java.time.Duration;
import java.time.LocalTime;

public interface Visitable {

    LocalTime getOpeningHours();

    LocalTime getClosingHours();

    /**
     * the following method sets a default opening hour
     */
    default void setOpeningHours() {
        LocalTime openingHours = LocalTime.of(9, 30);
    }

    /**
     * the following method sets a default closing hour
     */
    default void setClosingHours() {
        LocalTime closingHours = LocalTime.of(20, 00);
    }

    /**
     * @param openingHours : the time a certain location opens
     * @param closingHours : the time a certain location closes
     * @return : an object of type time representing the time in a day a certain location is open
     */
    static Duration getVisitingDuration(LocalTime openingHours, LocalTime closingHours) {


        Duration time = Duration.between(openingHours, closingHours);
        return time;
    }


}
