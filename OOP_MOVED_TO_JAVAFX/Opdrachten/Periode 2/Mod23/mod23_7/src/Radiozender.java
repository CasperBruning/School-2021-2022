public class Radiozender
{
    private String zenderkeuze;
    private int frequentie;

    //constructor
    public Radiozender(String zenderkeuze, int frequentie)
    {
        this.zenderkeuze = zenderkeuze;
        this.frequentie = frequentie;
    }

    //zenderkeuze
    public void setZenderkeuze(String zenderkeuze)
    {
        this.zenderkeuze = zenderkeuze;
    }

    public String getZenderkeuze()
    {
        return zenderkeuze;
    }

    //frequentie
    public void setFrequentie(int frequentie)
    {
        this.frequentie = frequentie;
    }

    public double getFrequentie()
    {
        return frequentie;
    }

    //print
    public void print()
    {
        System.out.println("Zenderkeuze: " + zenderkeuze);
        System.out.println("Frequentie: " + frequentie + " MHz");
    }
}
