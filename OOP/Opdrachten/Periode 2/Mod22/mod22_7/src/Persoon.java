public class Persoon
{
    private String naam;
    private int geboorteJaar;

//naam
    public void setNaam(String naam)
    {
        this.naam = naam;
    }


    public String getNaam()
    {
        return naam;
    }

//geboortejaar
    public void setGeboorteJaar(int geboorteJaar)
    {
        this.geboorteJaar = geboorteJaar;
    }


    public int getGeboortejaar()
    {
        return geboorteJaar;
    }


//leeftijd
    public String getLeeftijd(){
        int leeftijd = 2021 - geboorteJaar;
        String output = "Berekende leeftijd: " + leeftijd;
        return output;
    }
}