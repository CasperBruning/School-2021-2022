import java.util.Scanner;

public class Oefentoets22
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Auto skoda = new Auto();
        System.out.print("Geef het totaal aantal gereden kilometers: ");
        double aantalGeredenKM = keyboard.nextDouble();
        int benzineVerbruik = 14;

        System.out.println(benzinePrijsBerekenen(aantalGeredenKM, benzineVerbruik));
        skoda.aantalKM = aantalGeredenKM;
        skoda.benzineverbruik = benzineVerbruik;

    }

    public static String benzinePrijsBerekenen(double aantalGeredenKM, int benzineVerbruik)
    {
        double benzineprijs = (aantalGeredenKM / 14) * 1.95;
        String output = "De auto heeft " + aantalGeredenKM + " kilometer gereden met een verbruik van 1 op " + benzineVerbruik + "   " + "De totaalprijs van deze rit is dan: " + benzineprijs + " EURO";

        return output;
    }
}





























