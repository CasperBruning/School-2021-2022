import java.util.Random;
import java.util.Scanner;

public class Mod9H_12
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomGetal = rand.nextInt();
//        int randomGetal = 1; //test getal
        int aantalPogingen = 3;
        int herhalen = 0; //0 is niet herhalen. 1 is wel herhalen
        System.out.println("Raad spel!");
        System.out.println("Raad het random getal (1 t/m 10)");
        System.out.println("Je hebt 3 pogingen");
        do
        {
            aantalPogingen -= 1;
            int ingevoerdGetal = input.nextInt();
            if (ingevoerdGetal != randomGetal)
            {
                System.out.println("Dat was fout. probeer het opnieuw");
                System.out.println("Je hebt nog " + aantalPogingen + " pogingen");
                if (herhalen == 0)
                {
                    herhalen += 1;
                }
                if (aantalPogingen == 0)
                {
                    System.out.println("Helaas je hebt geen pogingen meer");
                    if (herhalen == 1)
                    {
                        herhalen -= 1;
                    }
                }
            }
            if (ingevoerdGetal == randomGetal)
            {
                System.out.println("Gefeliciteerd je hebt het goed geraden");
                if (herhalen == 1)
                {
                    herhalen -= 1;
                }
            }

        }
        while (herhalen == 1);


    }
}
