import java.util.Scanner;

public class Mod21_1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef jouw naam: ");
        String naam = keyboard.nextLine();
        naamafdrukken(naam);
    }

    public static void naamafdrukken(String naam)
    {

        System.out.println("Mijn naam is " + naam);
    }

}
