import java.util.ArrayList;

public class AirGuagua400 implements Plane {
    String matricula;
    int maxFuel= 100;
    int fuel= 0;
    ArrayList<String>movementList = new ArrayList<>();
    private boolean landingGear = false;
    private boolean takeOff = false;


    public AirGuagua400() {
    }

    @Override
    public float fuelLevel() {
        return fuel;
    }

    @Override
    public void refuel() {
        fuel = maxFuel;
    }

    @Override
    public void takeOff() {
         fuel -= 5;
        takeOff = !takeOff;


    }

    @Override
    public void flight() {
        movementList.add(1,"moviminto1");
        fuel  -= 10;
    }

    @Override
    public void landing() {
        landingGear = !landingGear;
    }

    @Override
    public String status() {
        return "El avion "+ matricula  + "\n" +
                "tiene el nivel combustible: " + fuelLevel() + "\n" +
                "y a seguido el siguiente pla de vuelo " + movementList + "\n";
    }
}
