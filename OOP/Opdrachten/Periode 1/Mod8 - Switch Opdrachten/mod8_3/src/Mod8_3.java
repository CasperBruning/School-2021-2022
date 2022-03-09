import java.util.Scanner;
public class Mod8_3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Give Grade: ");
        String grade = keyboard.nextLine();
        String meaningGrade = "";
        switch (grade){
            case "E":
                meaningGrade += "Excellent";
                break;
            case "V":
                meaningGrade += "Very Good";
                break;
            case "G":
                meaningGrade += "Good";
                break;
            case "A":
                meaningGrade += "Average";
                break;
            case "F":
                meaningGrade += "Fail";
                break;

        }
        System.out.println(meaningGrade);
        keyboard.close();
    }
}
