import java.util.Scanner;
public class Mod8_4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef het nummer van de maand: ");
        int monthNumber = keyboard.nextInt();
        int daysInMonth = 0;
        switch (monthNumber){
            case 1:
                daysInMonth += 31;
                break;
            case 2:
                daysInMonth += 28;
                break;
            case 3:
                daysInMonth += 31;
                break;
            case 4:
                daysInMonth += 30;
                break;
            case 5:
                daysInMonth += 31;
                break;
            case 6:
                daysInMonth += 30;
                break;
            case 7:
                daysInMonth += 31;
                break;
            case 8:
                daysInMonth += 31;
                break;
            case 9:
                daysInMonth += 30;
                break;
            case 10:
                daysInMonth += 31;
                break;
            case 11:
                daysInMonth += 30;
                break;
            case 12:
                daysInMonth += 31;
                break;
        }
        System.out.println("Deze maand heeft " + daysInMonth + " dagen");
    }
}
