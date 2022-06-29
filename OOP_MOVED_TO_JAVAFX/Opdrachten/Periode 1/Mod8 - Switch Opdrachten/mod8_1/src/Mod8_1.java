import java.util.Scanner;
public class Mod8_1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef het dagnummer (1 tot 7): ");
        int dagnummer = keyboard.nextInt();
        switch (dagnummer){
            case 1:
                System.out.println("De dag is dan: maandag");
                break;
            case 2:
                System.out.println("De dag is dan: dinsdag");
                break;
            case 3:
                System.out.println("De dag is dan: woensdag");
                break;
            case 4:
                System.out.println("De dag is dan: donderdag");
                break;
            case 5:
                System.out.println("De dag is dan: vrijdag");
                break;
            case 6:
                System.out.println("De dag is dan: zaterdag");
                break;
            case 7:
                System.out.println("De dag is dan: zondag");
                break;
        }
        keyboard.close();
    }
}
