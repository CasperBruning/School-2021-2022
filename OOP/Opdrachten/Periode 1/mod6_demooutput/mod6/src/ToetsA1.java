import java.util.Scanner;
public class ToetsA1
{
    public static void main(String[] args)
    {
        System.out.println("Toets van Casper Bruning");


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Gewicht (kg): ");
        Double gewichtInKg = keyboard.nextDouble();
        System.out.print("Lengte (cm): ");
        Double lengteInCm = keyboard.nextDouble();
        Double lengteInMeters = lengteInCm / 100;
        double bmi = gewichtInKg / (lengteInMeters * lengteInMeters);
        System.out.println("BMI is " + bmi);

    }
}
