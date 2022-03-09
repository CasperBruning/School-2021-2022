public class Mod22_7
{
    public static void main(String[] args)
    {
        Persoon persoon1 = new Persoon();

        persoon1.setNaam("Piet");
        persoon1.setGeboorteJaar(1980);

        System.out.println(persoon1.getNaam());
        System.out.println(persoon1.getGeboortejaar());
        System.out.println(persoon1.getLeeftijd());
    }
}
