public class DagRooster
{
    private String datum;
    private String blok1;
    private String blok2;



    public DagRooster(String datum){
        this.datum = datum;
    }

    public String getBlok1()
    {
        return blok1;
    }

    public void setBlok1(String blok1)
    {
        this.blok1 = blok1;
    }

    public String getBlok2()
    {
        return blok2;
    }

    public void setBlok2(String blok2)
    {
        this.blok2 = blok2;
    }

    @Override
    public String toString()
    {
        return "Rooster van: " + datum + "\n" +
                blok1 + "\n" +
                blok2;
    }

}
