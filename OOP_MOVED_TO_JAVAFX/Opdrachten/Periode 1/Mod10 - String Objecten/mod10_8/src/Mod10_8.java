import java.util.Scanner;

public class Mod10_8
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef je naam: ");
        String woord = keyboard.nextLine();
        int woordlength = woord.length();
        for (int i = 0; i < woordlength; i++)
        {
            System.out.println(woord);
        }
    }
}
