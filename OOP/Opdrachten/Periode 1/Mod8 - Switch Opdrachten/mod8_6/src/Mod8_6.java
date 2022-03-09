import java.util.Scanner;

public class Mod8_6
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een getal onder de zes in woorden: ");
        String numberInWords = keyboard.nextLine();
        int number = 0;
        int randNum = 5;
        String randNumWords = "";
        switch (numberInWords) {
            case "een":
                number += 1;
            case "twee":
                number += 2;
            case "drie":
                number += 3;
            case "vier":
                number += 4;
            case "vijf":
                number += 5;
            case "zes":
                number += 6;
        }
        switch (randNum){
            case 1 :
                randNumWords += "een";
            case 2 :
                randNumWords += "twee";
            case 3 :
                randNumWords += "drie";
            case 4 :
                randNumWords += "vier";
            case 5 :
                randNumWords += "vijf";
            case 6 :
                randNumWords += "zes";
        }
        if (randNum == number){
            System.out.println("Gefeliciteerd u heeft gewonnen");
        }else{
            System.out.println("Jammer het juiste getal was " + randNumWords);
        }
    }
}
