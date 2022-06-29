import java.util.Scanner;
import java.util.Random;
public class Mod9H_9
{
    public static void main(String[] args)
    {
        int herhalen = 0; //0 is niet herhalen. 1 is wel herhalen
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int randomGetal = rand.nextInt(1000);
        randomGetal += 1;
        System.out.println("Raad een getal tussen de 1 en de 1000: ");
        int hoevaakGeprobeerd = 0;
        do
        {
            hoevaakGeprobeerd += 1;
            int ingevoerdgetal = input.nextInt();
            if (ingevoerdgetal > randomGetal)
            {
                System.out.println("je gok is te hoog");
                if (herhalen == 0)
                {
                    herhalen += 1;
                }
            }
            if (ingevoerdgetal < randomGetal)
            {
                System.out.println("Je gok is te laag");
                if (herhalen == 0)
                {
                    herhalen += 1;
                }
            }
            if (ingevoerdgetal == randomGetal)
            {
                System.out.println("Gefeliciteerd je hebt gewonnen");
                System.out.println("je hebt het " +  hoevaakGeprobeerd + " keer geprobeerd.");
                if (herhalen == 1)
                {
                    herhalen -= 1;
                }
            }
        }
        while (herhalen == 1);

    }
}
