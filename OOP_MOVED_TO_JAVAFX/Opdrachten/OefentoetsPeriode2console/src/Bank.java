public class Bank
{
    private String bank;
    private String adres;
    private String plaats;

    public Bank(String bank)
    {
        this.bank = bank;
    }

    public String getBank()
    {
        return bank;
    }

    public String getAdres()
    {
        return adres;
    }

    public void setAdres(String adres)
    {
        this.adres = adres;
    }

    public String getPlaats()
    {
        return plaats;
    }

    public void setPlaats(String plaats)
    {
        this.plaats = plaats;
    }
}
