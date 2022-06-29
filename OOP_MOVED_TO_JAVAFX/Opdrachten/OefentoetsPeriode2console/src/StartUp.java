public class StartUp
{
    public static void main(String[] args)
    {
        Bankrekening rekening = new Bankrekening("NL021ABNA012356789", 125.0);

        Bank abn = new Bank("ABNAMRO");
        abn.setAdres("Geldweg 2");
        abn.setPlaats("Valutaveen");

        rekening.setBank(abn);

        Persoon rvl = new Persoon();
        rvl.setNaam("Roelof van Leeuwen");
        rvl.setPlaats("Zutphen");
        rvl.setLeeftijd(46);

        rekening.setEigenaarRekening(rvl);

        System.out.println(rekening);
    }
}

















