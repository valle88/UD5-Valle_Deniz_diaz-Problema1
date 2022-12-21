import java.util.ArrayList;

public class AirGuagua400 implements Plane {
    String matricula;
    int maxFuel= 0;
    int fuel;
    ArrayList<String>movementList = new ArrayList<>();
    private boolean landingGear;

    public AirGuagua400(String matricula, int maxFuel, int fuel, ArrayList<String> movementList, boolean landingGear) {
        this.matricula = matricula;
        this.maxFuel = maxFuel;
        this.fuel = fuel;
        this.movementList = movementList;
        this.landingGear=true;
    }


    @Override
    public float fuelLevel() {
        return fuel;
    }

    @Override
    public void refuel() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void flight() {

    }

    @Override
    public void landing() {
        landingGear = !landingGear;
    }

    @Override
    public String status() {
        return "El avion "+ matricula  + "\n" +
                "tiene el nivel combustible: " + fuel + "\n" +
                "y a seguido el siguiente pla de vuelo " + movementList + "\n";
    }
}
