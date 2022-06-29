public class Vak
{
    private String vak;
    private String lokaal;
    private String startTijd;
    private String stopTijd;
    private Docent docent;
    private Docent docentAfkorting;

    public Vak(String vak)
    {
        this.vak = vak;
    }

    public Docent getDocentAfkorting()
    {
        return docentAfkorting;
    }

    public void setLokaal(String lokaal)
    {
        this.lokaal = lokaal;
    }

    public void setStartTijd(String startTijd)
    {
        this.startTijd = startTijd;
    }

    public void setStopTijd(String stopTijd)
    {
        this.stopTijd = stopTijd;
    }

    public Docent getDocent()
    {
        return docent;
    }

    public void setDocent(Docent docent)
    {
        this.docent = docent;
    }

    @Override
    public String toString()
    {
        return startTijd + " - " + stopTijd + "   "+ vak + "   " + docent.getDocentAfkorting() + "   " + lokaal;
    }
}
