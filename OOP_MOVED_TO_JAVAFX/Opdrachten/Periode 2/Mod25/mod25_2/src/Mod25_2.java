public class Mod25_2
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        Adres adres1 = new Adres();

        student1.setAdres(adres1);

        student1.setNaam("naam");
        student1.setGeboortejaar(2005);

        adres1.setPlaats("Terborg");
        adres1.setPostcode("7071HR");
        adres1.setStraatEnHuisnummer("Vulcaanstraat 29");

        System.out.print(student1);
        
    }
}
