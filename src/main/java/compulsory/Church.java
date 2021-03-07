package compulsory;

import javafx.util.Pair;

import java.time.LocalTime;

public class Church extends Location implements Visitable{
    private Pair<LocalTime,LocalTime> visitingHours;
    private String name;

    public Church(Pair<LocalTime, LocalTime> visitingHours, String name) {
        super(name);
        this.visitingHours = visitingHours;
        this.name = name;
    }

    public Church(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public Pair<LocalTime, LocalTime> getVisitingHours() {
        return visitingHours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setVisitingHours(Pair<LocalTime, LocalTime> visitingHours) {
        this.visitingHours = visitingHours;
    }


}
