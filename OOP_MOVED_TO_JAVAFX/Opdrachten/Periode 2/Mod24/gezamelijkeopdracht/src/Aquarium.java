public class Aquarium
{
    private String merk;
    private double hoogte;
    private double breedte;
    private double diepte;
    private int aantalVissen;

    public String getMerk()
    {
        return merk;
    }

    public void setMerk(String merk)
    {
        this.merk = merk;
    }

    public double getHoogte()
    {
        return hoogte;
    }

    public void setHoogte(double hoogte)
    {
        this.hoogte = hoogte;
    }

    public double getBreedte()
    {
        return breedte;
    }

    public void setBreedte(double breedte)
    {
        this.breedte = breedte;
    }

    public double getDiepte()
    {
        return diepte;
    }

    public void setDiepte(double diepte)
    {
        this.diepte = diepte;
    }

    public int getAantalVissen()
    {
        return aantalVissen;
    }

    public void setAantalVissen(int aantalVissen)
    {
        this.aantalVissen = aantalVissen;
    }

    public void setChangeaantalvissen(int aantalvissen)
    {
        this.aantalVissen += aantalVissen;
    }

    public double getInhoud()
    {
        return hoogte * breedte * diepte;
    }

    public void print()
    {
        System.out.println("Aquarium");
        System.out.println("Merk: " + merk);
        System.out.println("Inhoud: " + getInhoud());
        System.out.println("Aantal vissen: " + aantalVissen);

    }
}
