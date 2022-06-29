import java.util.Scanner;
public class mod8_2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Give temperature: ");
        int temperatureCelcius = keyboard.nextInt();
        keyboard.close();
        String textMessage = "";
        if (temperatureCelcius < 0){
            textMessage += "Freezing weather";
        }if (temperatureCelcius >= 0 && temperatureCelcius <= 10){
            textMessage += "Very cold weather";
        }if (temperatureCelcius > 10 && temperatureCelcius <= 20){
            textMessage += "Cold weather";
        }if (temperatureCelcius > 20 && temperatureCelcius <= 30){
            textMessage += "Normal in Temp";
        }if (temperatureCelcius >30 && temperatureCelcius <= 40){
            textMessage += "Its Hot";
        }if (temperatureCelcius >40){
            textMessage += "its Very Hot";
        }

        System.out.println("Test Data:");
        System.out.println(temperatureCelcius + " Degrees Celcius");
        System.out.println("Message:");
        System.out.println(textMessage);



    }




}
