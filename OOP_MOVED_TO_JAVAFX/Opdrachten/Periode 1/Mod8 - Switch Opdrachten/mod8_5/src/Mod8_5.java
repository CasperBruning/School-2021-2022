import java.util.Scanner;
public class Mod8_5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef het nummer van de maand: ");
        int monthNumber = keyboard.nextInt();
        String monthName = "";
        switch (monthNumber){
            case 1:
                monthName += "Januari";
                break;
            case 2:
                monthName += "Februari";
                break;
            case 3:
                monthName += "Maart";
                break;
            case 4:
                monthName += "April";
                break;
            case 5:
                monthName += "Mei";
                break;
            case 6:
                monthName += "Juni";
                break;
            case 7:
                monthName += "Juli";
                break;
            case 8:
                monthName += "Augustus";
                break;
            case 9:
                monthName += "September";
                break;
            case 10:
                monthName += "Oktober";
                break;
            case 11:
                monthName += "November";
                break;
            case 12:
                monthName += "December";
                break;
            default:
                monthName += "INVALID MONTHNUMBER";
        }
        System.out.println("De maand is: " + monthName);
    }
}
