public class Mod9H_6
{
    public static void main(String[] args)
    {

        for ( int v = 1; v < 12; v++)
        {

            for (int h = 1; h < v; h++)
            {
                int som = h * 6;
                System.out.print(som + " ");
            }
            System.out.println();
        }
    }
}
