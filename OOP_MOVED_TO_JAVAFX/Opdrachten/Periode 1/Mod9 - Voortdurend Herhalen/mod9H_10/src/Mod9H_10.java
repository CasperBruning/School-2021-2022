import java.util.Scanner;
public class Mod9H_10
{
    public static void main(String[] args)
    {
        int herhalen = 0; //0 is niet herhalen. 1 is wel herhalen
        do
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Geef het aantal mijlen: ");
            double mijlen = input.nextDouble();
            double kilometers = mijlen * 1.609344;
            System.out.println("Dit is " + kilometers + " kilometers");
            Scanner scannerherhalen = new Scanner(System.in);
            System.out.print("Wilt u nog een conversie? (j/n): ");
            String inputherhalen = scannerherhalen.nextLine();
            if (inputherhalen.contentEquals("j") || inputherhalen.contentEquals("J"))
            {
                if (herhalen == 0)
                {
                    herhalen += 1;
                }
            }
            if (inputherhalen.contentEquals("n") || inputherhalen.contentEquals("N"))
            {
                if (herhalen == 1)
                {
                    herhalen -= 1;
                }
            }
        }
        while (herhalen == 1);


    }
}
