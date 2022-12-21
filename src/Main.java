import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la matricula:");
        String matricula = sc.nextLine();
        System.out.println("Dime el nivel gasolina de inicio:");
        String gasolina = sc.nextLine();




        AirGuagua400 f10 = new AirGuagua400();
        System.out.println(f10.toString());




    }
}