package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ProgramLogic.Subjects.ElectricityMeter;
import ProgramLogic.Subjects.HackerToolkit;
import ProgramLogic.Subjects.HomeElectrical.Appliances;
import ProgramLogic.Subjects.HomeElectrical.Audio;
import ProgramLogic.Subjects.HomeElectrical.HomeElectrical;
import ProgramLogic.Subjects.HomeElectrical.Video;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class ReflectionsFunctionalityTest {

    final ElectricityMeter ELECTRICITY_METER = new ElectricityMeter();
    final HackerToolkit HACKER_TOOLKIT = new HackerToolkit();
    final double CORRECT_ELECTRICITY_METER = 270;
    final double HACK_ELECTRICITY_METER = 220;

    final List<HomeElectrical> HOME_ELECTRICAL_LIST = Arrays.asList(
            new Audio("Columns", 60, false),
            new Audio("Stereo system", 100, true),
            new Video("TV", 50, false),
            new Appliances("CoffeeMachine", 20, true),
            new Appliances("Fridge", 150, true),
            new Appliances("Iron", 200, false)
    );

    final HomeElectrical HOME_ELECTRICAL = new Appliances("TeaMachine", 25, false);
    final double HACK_POWER_CONSUMPTION = 20;

    @Test
    public void calculatePowerConsumptionTest() {
        assertEquals(ELECTRICITY_METER.calculatePowerConsumption(HOME_ELECTRICAL_LIST), CORRECT_ELECTRICITY_METER);
    }

    @Test
    public void hackPowerConsumptionElectricityMeterTest() {
        ELECTRICITY_METER.calculatePowerConsumption(HOME_ELECTRICAL_LIST);
        HACKER_TOOLKIT.hackPowerConsumptionElectricityMeter(ELECTRICITY_METER, HACK_ELECTRICITY_METER);
        assertEquals(ELECTRICITY_METER.getPowerConsumption(), HACK_ELECTRICITY_METER);
    }

    @Test
    public void hackPowerConsumptionHomeElectricalTest() {
        HACKER_TOOLKIT.hackPowerConsumptionHomeElectrical(HOME_ELECTRICAL, HACK_POWER_CONSUMPTION);
        assertEquals(HOME_ELECTRICAL.getConsumption(), HACK_POWER_CONSUMPTION);
    }

}
