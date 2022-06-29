public class Tafel
{
    private String naam;
    private String lengte;
    private String breedte;
    private String hoogte;


    //constructor
    public Tafel(String naam)
    {
        this.naam = "onbekend";\\\\\\
        this.naam = naam;
    }

    //naam
    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public String getNaam()
    {
        String output = "Naam: " + naam;
        return output;
    }

    //lengte
    public void setLengte(String lengte)
    {
        this.lengte = lengte;
    }

    public String getLengte()
    {
        String output = "Lengte: " + lengte + " cm";
        return output;
    }

    //breedte
    public void setBreedte(String breedte)
    {
        this.breedte = breedte;
    }

    public String getBreedte(){
        String output = "Breedte: " + breedte + " cm";
        return output;
    }

    //hoogte
    public void setHoogte(String hoogte)
    {
        this.hoogte = hoogte;
    }

    public String getHoogte()
    {
        String output = "Hoogte: " + hoogte + " cm";
        return output;
    }

}
