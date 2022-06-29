public class Mod21_2
{
    public static void main(String[] args)
    {

        String naam = "Casper";
        String straat = "Lijsterstraat 2 ";
        String postcodeEnWoonplaats = "7071HR Ulft";
        naamafdrukken(naam);
        printAdres(straat, postcodeEnWoonplaats);
    }

    public static void naamafdrukken(String naam)
    {

        System.out.println("Mijn naam is Casper");
    }

    public static void printAdres(String straat, String postcodeEnWoonplaats)
    {
        System.out.println(straat);
        System.out.print(postcodeEnWoonplaats);
    }
}
