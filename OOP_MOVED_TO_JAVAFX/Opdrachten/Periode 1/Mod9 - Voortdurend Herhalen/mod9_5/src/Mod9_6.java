import java.util.Scanner;
public class Mod9_6
{
    public static void main(String[] args)
    {
        System.out.println("Wat is het commando in Java om uit een loop te stappen?");
        System.out.println("a. int");
        System.out.println("b. continue");
        System.out.println("c. break");
        System.out.println("d. exit");
        String opnieuwproberen = "";
        do{
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Geef jouw keuze: ");
            String antwoord = keyboard.nextLine();

            if (antwoord.contentEquals("c") || antwoord.contentEquals("C"))
            {
                System.out.println("Dit is het juiste antwoord!");
                opnieuwproberen = "n";
                }
             else
            {
                System.out.println("Incorrect");
                System.out.println("Opnieuw? Druk dan op j en enter om door te gaan. Wilt u het niet opnieuw proberen? druk dan op n en enter om te stoppen");
                opnieuwproberen = keyboard.nextLine();
            }
        }
        while (opnieuwproberen.contentEquals("j") || opnieuwproberen.contentEquals("J"));

    }
}
