public class Telefoon
{
    private String merk;
    private String type;
    private String prijs;


    //Merk
    public void setMerk(String merk)
    {
        this.merk = merk;
    }

    public String getMerk()
    {
        String output = "Merk: " + merk;
        return output;
    }

    //Type
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        String output = "Type: " + type;
        return output;
    }

    //prijs
    public void setPrijs(String prijs)
    {
        this.prijs = prijs;
    }

    public String getPrijs()
    {
        String output = "Prijs: " + prijs + " Euro";
        return output;
    }
}
