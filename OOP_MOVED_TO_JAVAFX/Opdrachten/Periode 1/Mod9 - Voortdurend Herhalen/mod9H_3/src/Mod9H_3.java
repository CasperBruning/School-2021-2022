import java.util.Scanner;
public class Mod9H_3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int herhalen = 0; //0 is niet herhalen. 1 is wel herhalen

        do
        {
            System.out.print("Geef uw geboortemaand in cijfers: ");
            int geboortemaand = keyboard.nextInt();
            if (geboortemaand > 0 && geboortemaand <= 12)
            {
                System.out.println("Wist u dat uw geboortemaand " + geboortemaand + " is?");
                if (herhalen == 1)
                {
                    herhalen -= 1;
                }
            }
            else
            {
                System.out.println("Dit is geen geldige maandnummer, voer het opnieuw in.");
                if (herhalen == 0)
                {
                    herhalen += 1;
                }

            }
        }
        while (herhalen == 1);
    }
}
