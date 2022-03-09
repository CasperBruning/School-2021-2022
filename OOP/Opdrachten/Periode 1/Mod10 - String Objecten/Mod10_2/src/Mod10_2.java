import java.util.Scanner;

public class Mod10_2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String woord1 = keyboard.nextLine();
        int lengtewoord1 = woord1.length();
        System.out.println("Dit woord bevat " + lengtewoord1 + " karakters");
    }
}
