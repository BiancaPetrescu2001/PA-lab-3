package compulsory;

import javafx.util.Pair;

import java.time.LocalTime;

public interface Visitable {

    Pair<LocalTime,LocalTime> getVisitingHours();

}
