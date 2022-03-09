import java.util.Random;
import java.util.Scanner;

public class Mod10H_7
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("De rekenquiz start..");

        int herhalen = 1; //0 niet herhalen, 1 wel herhalen
        int rekenOperator = rand.nextInt(2); //0 is +. 1 is *
        int randNummer1 = rand.nextInt(10);
        int randNummer2 = rand.nextInt(10);
        int som = 0;
        String rekenOperatorString = " ";
        if (rekenOperator == 0)
        {
            som = randNummer1 + randNummer2;
            rekenOperatorString = "+";
        }
        if (rekenOperator == 1)
        {
            som = randNummer1 * randNummer2;
            rekenOperatorString = "x";
        }
        do
        {
            System.out.print("Wat is de uitkomst van " + randNummer1 + " " + rekenOperatorString + " " + randNummer2 + "? ");
            int userInput = keyboard.nextInt();
            if (userInput == som)
            {
                System.out.println("Goed");
                System.out.println("Einde quiz.");
                if (herhalen == 1)
                {
                    herhalen -= 1;
                }
            }
            else
            {
                System.out.println("Fout");
                if (herhalen == 0)
                {
                    herhalen += 1;
                }
            }
        }
        while (herhalen == 1);
    }
}
