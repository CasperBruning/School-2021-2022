import java.util.Scanner;

public class Mod21_5
{
    public static void main(String[] args)
    {
        String name = vraagNaam();
        String straat = "Lijsterstraat ";
        int huisnummer = 2;
        String postcode = "7071HR ";
        String plaats = "Ulft ";
        printNaam(name);
        printAdres(straat, huisnummer, postcode, plaats);
    }

    public static String vraagNaam()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef je naam: ");
        String name = keyboard.nextLine();
        return (name);
    }

    public static void printNaam(String name)
    {
        System.out.println("Mijn naam is " + name);
    }


    public static void printAdres(String straat, int huisnummer, String postcode, String plaats)
    {
        System.out.print(straat);
        System.out.println(huisnummer);
        System.out.print(postcode);
        System.out.print(plaats);
    }
}
