import java.util.Scanner;

public class Mod10_3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String woord = keyboard.nextLine();


        char r = woord.charAt(2);
        woord = woord.replace("h" , "#");
        System.out.println(woord);
    }
}
