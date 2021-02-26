package ProgramLogic.Subjects;


import ProgramLogic.Subjects.HomeElectrical.HomeElectrical;

import java.util.List;

// подсчитывает и выдаёт на экран показания суммарно потраченной энергии всех включенных приборов
public class ElectricityMeter {

    private double powerConsumption;
    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double calculatePowerConsumption(List<HomeElectrical> homeElectricalList) {
        powerConsumption = 0.0;
        for (HomeElectrical homeElectrical : homeElectricalList) {
            if (homeElectrical.isPower()) powerConsumption += homeElectrical.getConsumption();
        }
        System.out.println(powerConsumption);
        return powerConsumption;
    }

}
