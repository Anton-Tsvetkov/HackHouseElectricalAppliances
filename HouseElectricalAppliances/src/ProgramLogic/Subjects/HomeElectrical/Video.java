package ProgramLogic.Subjects.HomeElectrical;

public class Video extends HomeElectrical {

    public Video(String name) {
        super(name);
    }

    public Video(String name, double consumption, boolean power) {
        super(name, consumption, power);
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + getName() + '\'' +
                ", consumption=" + getConsumption() +
                ", power=" + isPower() +
                '}';
    }
}
