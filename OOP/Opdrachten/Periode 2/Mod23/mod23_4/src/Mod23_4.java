public class Mod23_4
{
    public static void main(String[] args)
    {
        Magazijnartikel artikel1 = new Magazijnartikel();
        Magazijnartikel artikel2 = new Magazijnartikel();

        artikel1.setArtikelNaam("houtschroeven 4x35");

        artikel2.setArtikelNaam("metaalschroeven M3x10");
        artikel2.setAantal(150);

        print(artikel1.getArtikelNaam(), artikel1.getAantal());
        print(artikel2.getArtikelNaam(), artikel2.getAantal());
    }

    public static void print(String naam, String aantal)
    {
        System.out.println(naam);
        System.out.println(aantal);
    }
}
