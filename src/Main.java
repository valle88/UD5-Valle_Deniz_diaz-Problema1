import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la matricula:");
        String matricula = sc.nextLine();






        AirGuagua400 f10 = new AirGuagua400();
        //f10.fuelLevel();
        //f10.flight();
        //f10.refuel();

        System.out.println(f10.toString());




    }
}