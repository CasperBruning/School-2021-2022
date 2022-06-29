import java.util.Scanner;
import java.util.Random;
public class Mod9H_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int herhalen = 0; //0 is niet herhalen. 1 is wel herhalen
        do
        {
            System.out.print("Voer het nummer in (1 t/m 4): ");
            int ingevoerdewaarde = input.nextInt();
            int randomwaarde = rand.nextInt(4);
            if (randomwaarde == ingevoerdewaarde)
            {
                System.out.println("Goed gedaan! u heeft het juiste getal geraden");
                if (herhalen == 1)
                {
                    herhalen -=1;
                }
            }
            else
            {
                System.out.println("Helaas u heeft het niet goed geraden, Probeer het opnieuw!");
                if(herhalen == 0)
                {
                    herhalen += 1;
                }
            }

        }
        while (herhalen == 1);

    }
}
