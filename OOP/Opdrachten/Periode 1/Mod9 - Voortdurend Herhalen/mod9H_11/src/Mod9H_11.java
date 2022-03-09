import java.util.Scanner;
public class Mod9H_11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef de beginwaarde: ");
        int beginwaarde = input.nextInt();
        System.out.print("Geef de eindwaarde: ");
        int eindwaarde = input.nextInt();
        if (beginwaarde < eindwaarde)
        {
            for (; beginwaarde <= eindwaarde; beginwaarde++)
            {
                System.out.println(beginwaarde);
            }
        }
        if (beginwaarde > eindwaarde)
        {
            for (; beginwaarde >= eindwaarde; beginwaarde--)
            {
                System.out.println(beginwaarde);
            }
        }

    }
}
