public class Magazijnartikel
{
    private String artikelNaam;
    private int aantal;

    //constructor
    public Magazijnartikel()
    {
        this.aantal = 100;
    }

    //artikelnaam
    public void setArtikelNaam(String artikelNaam)
    {
        this.artikelNaam = artikelNaam;
    }

    public String getArtikelNaam(){
        return "Artikelnaam: " + artikelNaam;
    }

    //aantal
    public void setAantal(int aantal)
    {
        this.aantal = aantal;
    }

    public String getAantal()
    {
        return "Aantal: " + aantal;
    }
}
