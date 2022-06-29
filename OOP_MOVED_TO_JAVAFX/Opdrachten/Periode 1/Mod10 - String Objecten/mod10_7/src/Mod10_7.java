import java.util.Scanner;

public class Mod10_7
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef je naam: ");
        String naam = keyboard.nextLine();
        int naamlength = naam.length();
        for (int i = 0; i < naamlength; i++)
        {
            char charwoord = naam.charAt(i);
            System.out.println(charwoord);
        }
    }
}
