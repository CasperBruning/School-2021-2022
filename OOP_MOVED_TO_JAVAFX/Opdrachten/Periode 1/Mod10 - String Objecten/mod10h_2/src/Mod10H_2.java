import java.util.Scanner;

public class Mod10H_2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de tafel op: ");
        int tafel = keyboard.nextInt();

        for (int i = 1; i <= 10 ; i++)
        {
            int som = i * tafel;
            System.out.println(i + " x " + tafel + " = " + som);
        }
    }
}
