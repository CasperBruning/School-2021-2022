public class Mod21_3
{
    public static void main(String[] args)
    {

        String naam = "Casper";
        String straat = "Lijsterstraat 2 ";
        String postcode = "7071HR ";
        String plaats = "Ulft ";
        printNaam("Casper");
        printAdres(straat, postcode, plaats);
    }



    public static void printNaam(String naam)
    {

        System.out.println("Mijn naam is " + naam);
    }




    public static void printAdres(String straat, String postcode, String plaats)
    {
        System.out.println(straat);
        System.out.print(postcode);
        System.out.print(plaats);
    }
}
