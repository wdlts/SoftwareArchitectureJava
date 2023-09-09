package DZ3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping, CarWashing {


    private Refueling refueling;
    private CarWashing carWashing;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setCarWash(CarWash carWash) {
        this.carWashing = carWash;
    }


    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null){
                refueling.fuel(fuelType);
        }
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }



    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    public void wash(WashType washType) {
        if (carWashing != null){
            carWashing.wash(washType);
        }
    }
}
