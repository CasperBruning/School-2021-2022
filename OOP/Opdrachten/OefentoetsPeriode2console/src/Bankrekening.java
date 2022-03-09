public class Bankrekening
{
    private String bankrekening;
    private Double saldo;
    private Bank bank;
    private Persoon eigenaarRekening;

    public void setEigenaarRekening(Persoon eigenaarRekening)
    {
        this.eigenaarRekening = eigenaarRekening;
    }

    public void setBank(Bank bank)
    {
        this.bank = bank;
    }

    public Bankrekening(String bankrekening, double saldo)
    {
        bankrekening = bankrekening;
        saldo = saldo;
    }

    public String getBankrekening()
    {
        return bankrekening;
    }

    public Double getSaldo()
    {
        return saldo;
    }
}
