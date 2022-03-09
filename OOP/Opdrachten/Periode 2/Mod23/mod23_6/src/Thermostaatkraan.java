public class Thermostaatkraan
{
    private String naam;
    private double temperatuur;

    //constructor
    public Thermostaatkraan()
    {
        this.temperatuur = 30;
    }

    //naam
    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public String getNaam()
    {
        return naam;
    }

    //temperatuur
    public void setTemperatuur(double temperatuur)
    {
        this.temperatuur = temperatuur;
    }

    public double getTemperatuur()
    {
        return temperatuur;
    }

    //print
    public void print()
    {
        System.out.println("Naam: " + naam);
        System.out.println("Temperatuur: " + temperatuur);
    }
}
