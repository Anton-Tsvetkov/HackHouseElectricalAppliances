package ProgramLogic.Subjects;


import ProgramLogic.Subjects.HomeElectrical.HomeElectrical;

import java.lang.reflect.Field;

// может менять показания ElectricityMeter, изменять потребляемый ток приборов
public class HackerToolkit {

    public void hackPowerConsumptionElectricityMeter(ElectricityMeter electricityMeter, double consumption) {
        try {
            Field field = ElectricityMeter.class.getDeclaredField("powerConsumption");
            field.setAccessible(true);
            field.set(electricityMeter, consumption);
        } catch (NoSuchFieldException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public void hackPowerConsumptionHomeElectrical(HomeElectrical homeElectrical, double consumption) {
        try {
            Field field = HomeElectrical.class.getDeclaredField("consumption");
            field.setAccessible(true);
            field.set(homeElectrical, consumption);
        } catch (NoSuchFieldException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }
}
