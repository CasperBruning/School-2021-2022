public class Mod21_4
{
    public static void main(String[] args)
    {

        String naam = "Casper";
        String straat = "Lijsterstraat ";
        int huisnummer = 2;
        String postcode = "7071HR ";
        String plaats = "Ulft ";
        printNaam(naam);
        printAdres(straat, huisnummer, postcode, plaats);
    }



    public static void printNaam(String naam)
    {

        System.out.println("Mijn naam is " + naam);
    }




    public static void printAdres(String straat, int huisnummer, String postcode, String plaats)
    {
        System.out.print(straat);
        System.out.println(huisnummer);
        System.out.print(postcode);
        System.out.print(plaats);
    }
}
