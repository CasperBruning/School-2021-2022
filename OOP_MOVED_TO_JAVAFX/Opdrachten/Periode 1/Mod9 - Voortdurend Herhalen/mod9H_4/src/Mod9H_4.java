import java.util.Scanner;
public class Mod9H_4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int herhalen = 0; //0 is niet herhalen. 1 is wel herhalen
        do
        {
            System.out.print("Geef uw geboortemaand in cijfers: ");
            int geboortemaandInCijfers = keyboard.nextInt();
            String geboortemaandInLetters = "";
            switch (geboortemaandInCijfers)
            {
                case 1:
                    geboortemaandInLetters += "januari";
                    break;
                case 2:
                    geboortemaandInLetters += "februari";
                    break;
                case 3:
                    geboortemaandInLetters += "maart";
                    break;
                case 4:
                    geboortemaandInLetters += "april";
                    break;
                case 5:
                    geboortemaandInLetters += "mei";
                    break;
                case 6:
                    geboortemaandInLetters += "juni";
                    break;
                case 7:
                    geboortemaandInLetters += "juli";
                    break;
                case 8:
                    geboortemaandInLetters += "augustus";
                    break;
                case 9:
                    geboortemaandInLetters += "september";
                    break;
                case 10:
                    geboortemaandInLetters += "october";
                    break;
                case 11:
                    geboortemaandInLetters += "november";
                    break;
                case 12:
                    geboortemaandInLetters += "december";
                    break;

            }
            if (geboortemaandInCijfers > 0 && geboortemaandInCijfers <= 12)
            {
                System.out.println("Wist u dat uw geboortemaand " + geboortemaandInLetters + " is?");
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
