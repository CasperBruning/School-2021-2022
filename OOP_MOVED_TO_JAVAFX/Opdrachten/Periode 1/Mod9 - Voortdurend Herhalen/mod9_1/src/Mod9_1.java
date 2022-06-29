import java.util.Scanner;
import java.util.Random;
public class Mod9_1
{
    public static void main(String[] args)
    {
        while (true){
            Scanner keyboard = new Scanner(System.in);
            Random rand = new Random();
            System.out.print("Geef een getal onder de vier in woorden: ");
            String numberInWords = keyboard.nextLine();
            int number = 0;
            int randNum = rand.nextInt(4);
            randNum += 1;
            String randNumWords = "";
            switch (numberInWords) {
                case "een":
                    number += 1;
                    break;
                case "twee":
                    number += 2;
                    break;
                case "drie":
                    number += 3;
                    break;
                case "vier":
                    number += 4;
                    break;
            }
            switch (randNum){
                case 1:
                    randNumWords += "een";
                    break;
                case 2:
                    randNumWords += "twee";
                    break;
                case 3:
                    randNumWords += "drie";
                    break;
                case 4:
                    randNumWords += "vier";
                    break;
            }
            if (randNum == number){
                System.out.println("Gefeliciteerd u heeft gewonnen");

            }else{
                System.out.println("Jammer het juiste getal was " + randNumWords);
            }
        }
    }
}