import java.util.Scanner;

public class Mod9H_7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Voer de lengte in: ");
        int lengte = input.nextInt();
        System.out.print("Voer de hoogte in: ");
        int hoogte = input.nextInt();
//        int lengte = 6;
//        int hoogte = 10;
        hoogte /= 2;
        double lengtestreepjes = lengte * 3.6;
        for (int hl = 0; hl <= lengtestreepjes; hl++)
        {
            System.out.print("-");
        }
        System.out.println("");
        for (int v = 1 ; v < hoogte; v++)
        {
            System.out.print("|");
            for (int h = 1; h < lengte; h++)
            {

                System.out.print("##  ");
            }
            System.out.print("|");
            System.out.println();
            System.out.print("|");
            for (int hh = 1; hh < lengte; hh++)
            {
                System.out.print("  ##");
            }
            System.out.print("|");
            System.out.println();
        }
        for (int hl = 0; hl <= lengtestreepjes; hl++)
        {
            System.out.print("-");
        }

    }
}
