import java.util.Random;
import java.util.Scanner;

public class Mod10H_4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Geef de lengte of breedte: ");
        int lengte = keyboard.nextInt();



        for (int x = 1; x <= lengte; x++)
        {
            int random = rand.nextInt(10);
            System.out.print(random + " ");



            for (int y = 1; y <= lengte-1; y++)
            {
                int random1 = rand.nextInt(10);
                System.out.print(random1 + " ");
            }
            System.out.println("");
        }

    }
}
