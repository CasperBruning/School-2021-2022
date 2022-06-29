import java.util.Scanner;

public class Mod10_1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String woord1 = keyboard.nextLine();
        String woord2 = woord1.toUpperCase();
        System.out.println("Het woord in hoofdletters: " + woord2);
    }
}
