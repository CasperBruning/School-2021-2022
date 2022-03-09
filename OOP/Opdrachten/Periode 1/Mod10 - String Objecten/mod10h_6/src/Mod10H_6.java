import java.util.Random;
import java.util.Scanner;

public class Mod10H_6
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int herhalen = 1; //0 niet herhalen, 1 wel herhalen
        int randomSomGetal = rand.nextInt(10);
        int som = 3 * randomSomGetal;
        do
        {
            System.out.print("Wat is de uitkomst van 3 x " + randomSomGetal + "? ");
            int userInput = keyboard.nextInt();
            if (userInput == som)
            {
                System.out.println("Goed");
                if (herhalen == 1)
                {
                    herhalen = - 1;
                }
            }
            else
            {
                System.out.println("Fout");
                if (herhalen == 0)
                {
                    herhalen = + 1;
                }
            }
        }
        while (herhalen == 1);



    }
}
