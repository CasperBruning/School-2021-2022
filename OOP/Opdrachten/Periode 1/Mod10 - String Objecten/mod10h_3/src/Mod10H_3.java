import java.util.Scanner;

public class Mod10H_3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de lengte A: ");
        double lengteA = keyboard.nextDouble();
        System.out.print("Geef de lengte B: ");
        double lengteB = keyboard.nextDouble();
        double kwadraatLengteA = lengteA * lengteA;
        double kwadraatLengteB = lengteB * lengteB;
        double uitkomst = Math.sqrt((kwadraatLengteA + kwadraatLengteB));
        System.out.println("Berekende lengte C: " + uitkomst);
    }
}
