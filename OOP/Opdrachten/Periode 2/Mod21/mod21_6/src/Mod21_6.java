import java.util.Scanner;

public class Mod21_6
{
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args)
    {
        String name = vraagInfo();
        String straat = vraagInfo();
        int huisnummer = 2;
        String postcode = vraagInfo();
        String plaats = vraagInfo();




        printNaam(name);
        printAdres(straat, huisnummer, postcode, plaats);
    }

    public static String vraagInfo()
    {
        System.out.print("Geef je naam: ");
        String name = keyboard.nextLine();
        System.out.print("Wat is je woonplaats: ");
        String straat = keyboard.nextLine();
        System.out.print("Geef je naam: ");
        String postcode = keyboard.nextLine();
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
