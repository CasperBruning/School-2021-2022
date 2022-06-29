import java.util.Scanner;
public class Mod9H_5
{
    public static void main(String[] args)
    {
        int herhalen = 0; //0 is niet herhalen. 1 is wel herhalen
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Jouw naam is: ");
        do
        {
            String gegevenNaam = keyboard.nextLine();
            if ( gegevenNaam.contentEquals("Casper") || gegevenNaam.contentEquals("casper"))
            {
                System.out.println("Dit is van jou");
                if (herhalen == 1)
                {
                    herhalen -= 1;
                }
            }
            else
            {
                System.out.print("dit is niet van jou!!!, probeer het nog een keer: ");
                if (herhalen == 0)
                {
                    herhalen += 1;
                }
            }
        }
        while (herhalen == 1);
        }

}
