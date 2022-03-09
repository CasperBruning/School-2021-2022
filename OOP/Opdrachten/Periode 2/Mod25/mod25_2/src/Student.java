public class Student
{
    private String naam;
    private int geboortejaar;
    private Adres adres;

    public String getNaam()
    {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public int getGeboortejaar()
    {
        return geboortejaar;
    }

    public void setGeboortejaar(int geboortejaar)
    {
        this.geboortejaar = geboortejaar;
    }

    public void setAdres(Adres adres){
        this.adres = adres;
    }

    public Adres getAdres(){
        return adres;
    }

    public String toString()
    {
        return "Naam:" + naam + "\n" +
                "Geboortejaar: " + geboortejaar + "\n" +
                "Adres: " + adres.getStraatEnHuisnummer() + "\n" +
                "Postcode: " + adres.getPostcode() + "\n" +
                "Plaats: " + adres.getPlaats() + "\n";

    }
}
