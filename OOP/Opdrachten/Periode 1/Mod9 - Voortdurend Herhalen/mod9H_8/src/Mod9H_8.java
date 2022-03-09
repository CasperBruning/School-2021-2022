import java.util.Scanner;
public class Mod9H_8
{
    public static void main(String[] args)
    {


        int herhalen = 0; //0 is niet herhalen. 1 is wel herhalen
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wat is het leukste vak in deze opleiding?");
        System.out.println("1: PHP");
        System.out.println("2: Java/OOP");
        System.out.println("3: Webdevelopment");
        System.out.println("4: Engels");
        do
        {

            int gekozenAntwoord = keyboard.nextInt();

            if (gekozenAntwoord == 2)
            {
                System.out.println("Goedzo, Java/OOP is het leukste vak van de opleiding!");
                if (herhalen == 1)
                {
                    herhalen -= 1;
                }
            }
            else
            {
                System.out.println("Fout, probeer het opnieuw!");
                if (herhalen == 0)
                {
                    herhalen += 1;
                }
            }
        }
        while (herhalen == 1);
    }
}
