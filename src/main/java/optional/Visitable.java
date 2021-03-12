package optional;

import java.time.Duration;
import java.time.LocalTime;

public interface Visitable {

    LocalTime getOpeningHours();
    LocalTime getClosingHours();
    default void setOpeningHours(){
        LocalTime openingHours= LocalTime.of(9,30);
    }
    default void setClosingHours(){
        LocalTime closingHours= LocalTime.of(20,00);
    }
    static Duration getVisitingDuration(LocalTime openingHours, LocalTime closingHours) {


        Duration time = Duration.between(openingHours, closingHours);
        return time;
    }


}
