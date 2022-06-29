import java.util.Scanner;

public class Mod10_4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Karakter: ");
        String karakter = keyboard.nextLine();
        String karakterLowerCase = karakter.toLowerCase();

        System.out.println("Kleine letter: " + karakterLowerCase);

    }
}
