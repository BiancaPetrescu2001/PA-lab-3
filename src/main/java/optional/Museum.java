package optional;

import javafx.util.Pair;

import java.time.LocalTime;

public class Museum extends Location implements  Payable {

    private String name;
    private double fee;
    private Pair<LocalTime,LocalTime> visitingHours;

    public Museum(String name,  double fee, Pair<LocalTime, LocalTime> visitingHours) {
        super(name);
        this.name = name;
        this.fee = fee;
        this.visitingHours = visitingHours;
    }

    public Museum(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    public double getEntryFee() {
        return fee;
    }



    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setVisitingHours(Pair<LocalTime, LocalTime> visitingHours) {
        this.visitingHours = visitingHours;
    }
}
