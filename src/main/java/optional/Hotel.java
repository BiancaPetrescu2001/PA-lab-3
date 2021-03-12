package optional;

import javafx.util.Pair;

import java.time.LocalTime;

public class Hotel extends Location implements  Classifiable, Payable {

    private String name;
    private int rank;
    private Pair<LocalTime,LocalTime> visitingHours;
    private double fee;

    public Hotel(String name, int rank, Pair<LocalTime, LocalTime> visitingHours, double fee) {
        super(name);
        this.name = name;
        this.rank = rank;
        this.visitingHours = visitingHours;
        this.fee = fee;
    }

    public Hotel(String name) {
        super(name);
        this.name = name;
    }



    @Override
    public int getRank()
    {
        return rank;
    }

    @Override
    public double getEntryFee()
    {
        return fee;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setRank(int rank) {
        this.rank = rank;
    }


    public void setVisitingHours(Pair<LocalTime, LocalTime> visitingHours) {
        this.visitingHours = visitingHours;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
