public class Mod9_3
{
    public static void main(String[] args)
    {
        int som = 0;
        for (int nummer = 1; nummer <= 50; nummer++)
        {

            som += nummer;
            System.out.print(nummer + " ");

        }
        System.out.println(" ");
        System.out.println("De som van deze getallen is: " + som);
    }
}