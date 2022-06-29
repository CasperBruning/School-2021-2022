import java.util.Scanner;

public class Mod10H_1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String woord = keyboard.nextLine();
        int length = woord.length();

        for (int i = length - 1; i >= 0; i--)
        {
            System.out.print(woord.charAt(i));
        }

    }

}
