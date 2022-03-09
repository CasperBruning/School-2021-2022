import java.util.Scanner;

public class Mod10_10
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef tekst 1 op: ");
        String tekst1 = keyboard.nextLine();
        System.out.println("Geef tekst 2 op: ");
        String tekst2 = keyboard.nextLine();
        int tekst1Length = tekst1.length();
        int tekst2Length = tekst2.length();
        if (tekst1Length == tekst2Length)
        {
            System.out.println("De teksten hebben dezelfde lengte");
        }
        else
        {
            System.out.println("De teksten hebben niet dezelde lengte");
        }

    }
}
