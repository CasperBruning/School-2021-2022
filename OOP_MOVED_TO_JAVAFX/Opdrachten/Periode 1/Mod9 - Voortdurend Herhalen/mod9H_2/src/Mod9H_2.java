import java.util.Scanner;
import java.util.Random;
public class Mod9H_2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int herhalen = 0; //0 is niet herhalen. 1 is wel herhalen
        int getalVoorDeX = rand.nextInt(10);
        getalVoorDeX += +1;
        int getalNaDeX = rand.nextInt(10);
        getalNaDeX += 1;
        int som = getalVoorDeX * getalNaDeX;

        do
        {
            System.out.println("Wat is de uitkomst van " + getalVoorDeX + " x " + getalNaDeX + " ?");
            int ingevoerdeWaarde = keyboard.nextInt();

            if (ingevoerdeWaarde == som)
            {
                System.out.println("Goed gedaan! Dat is het juiste antwoord.");
                if (herhalen == 1)
                {
                    herhalen -= 1;
                }
            }
            else
            {
                System.out.println("Helaas dat is niet goed, Probeer het opnieuw");
                if (herhalen == 0)
                {
                    herhalen += 1;
                }
            }
        }
        while (herhalen == 1);




    }

}

