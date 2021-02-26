package ProgramLogic.Subjects.HomeElectrical;

import java.io.Serializable;

public abstract class HomeElectrical implements Serializable {

    private String name;
    private double consumption;
    private boolean power;


    transient boolean isExist;

    {
        isExist = true;
    }

    public HomeElectrical(String name) {
        this.name = name;
        this.power = false;
    }

    public HomeElectrical(String name, double consumption, boolean power) {
        this.name = name;
        this.consumption = consumption;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public double getConsumption() {
        return consumption;
    }

    public boolean isPower() {
        return power;
    }

    public boolean isExist() {
        return isExist;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "name='" + name + '\'' +
                ", consumption=" + consumption +
                ", power=" + power +
                '}';
    }
}
