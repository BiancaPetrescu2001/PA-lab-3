package optional;

import javafx.util.Pair;

import java.time.LocalTime;

public class Restaurant extends Location implements  Classifiable {
    private Pair<LocalTime,LocalTime> visitingHours;
    private String name;
    private int rank;


    public Restaurant(String name, Pair<LocalTime, LocalTime> visitingHours, int rank) {
        super(name);
        this.visitingHours = visitingHours;
        this.name = name;
        this.rank = rank;
    }

    public Restaurant(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRank() {
        return rank;
    }


    public void setVisitingHours(Pair<LocalTime, LocalTime> visitingHours) {
        this.visitingHours = visitingHours;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
