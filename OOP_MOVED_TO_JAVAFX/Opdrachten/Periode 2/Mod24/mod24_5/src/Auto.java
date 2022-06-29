public class Auto
{
    private String merk;
    private String kleur;
    private int maxSnelheid;
    private int huidigeSnelheid;

    public Auto(String merk)
    {
        this.merk = merk;
    }

    public String getKleur()
    {
        return kleur;
    }

    public void setKleur(String kleur)
    {
        this.kleur = kleur;
    }

    public int getMaxSnelheid()
    {
        return maxSnelheid;
    }

    public void setMaxSnelheid(int maxSnelheid)
    {
        this.maxSnelheid = maxSnelheid;
    }

    public int getHuidigeSnelheid()
    {
        return huidigeSnelheid;
    }

    public void setHuidigeSnelheid(int huidigeSnelheid)
    {
        this.huidigeSnelheid = huidigeSnelheid;
    }

    public String getMerk()
    {
        return merk;
    }

    public void print()
    {
        System.out.println("Auto");
        System.out.println("Merk: " + merk);
        System.out.println("Kleur: " + kleur);
        System.out.println("Max. Snelheid: " + maxSnelheid);
        System.out.println("Huidige Snelheid: " + huidigeSnelheid);
        System.out.println();
    }

}
