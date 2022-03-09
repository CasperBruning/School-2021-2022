public class Bankrekening
{
    private String rekeningnummer;
    private double saldo;
    private Persoon eigenaar;


    public String getRekeningnummer()
    {
        return rekeningnummer;
    }

    public void setRekeningnummer(String rekeningnummer)
    {
        this.rekeningnummer = rekeningnummer;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public Persoon getEigenaar()
    {
        return eigenaar;
    }

    public void setEigenaar(Persoon eigenaar)
    {
        this.eigenaar = eigenaar;
    }

    public String toString()
    {
        return "Rekeningnummer: " + rekeningnummer + "/n" +
                "Saldo: " + String.format("EURO %.2f" , getSaldo()) + "/n" +
                "Naam eigenaar" + getEigenaar() + "/n" +
                "Woonplaats eigenaar" + eigenaar.getWoonPlaats();
    }
}
