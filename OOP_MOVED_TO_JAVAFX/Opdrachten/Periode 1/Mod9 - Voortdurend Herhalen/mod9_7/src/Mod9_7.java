import java.util.Scanner;
public class Mod9_7
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een startwaarde: ");
        int startwaarde = keyboard.nextInt();
        System.out.print("Geef een eindwaarde: ");
        int eindwaarde = keyboard.nextInt();

        while(startwaarde <= eindwaarde)
        {
            System.out.println(startwaarde);
            startwaarde++;
        }
    }
}
