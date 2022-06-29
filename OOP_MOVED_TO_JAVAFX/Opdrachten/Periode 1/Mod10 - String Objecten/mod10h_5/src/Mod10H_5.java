import java.util.Scanner;

public class Mod10H_5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een zin op: ");
        String zin = keyboard.nextLine();
        String[] lijst = zin.split(" ");
        for (String s : lijst)
        {
            System.out.println(s);
        }

    }
}
