import java.util.Scanner;
public class Afronden
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Geef gereden kilometers: ");
        Auto auto = new Auto();
        auto.kilometersGereden = scanner.nextDouble();
        auto.verbruik = 14;


        System.out.println("De auto heeft " + auto.kilometersGereden + " gereden met een verbruik van 1 op " + auto.verbruik);
        double prijs = bezinePrijs(auto.kilometersGereden, auto.verbruik);
        System.out.println( String.format("De totaalprijs van deze rit is dan:  %.2f euros", prijs)); // afronden 2 decimalen v


    }

    public static double bezinePrijs(Double geredenKilometers,int verbruik){
        return (geredenKilometers /verbruik) * 1.95;
    }
}