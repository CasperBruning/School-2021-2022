public class Docent
{
    private String docentNaam;
    private String docentAfkorting;


    public Docent(String docent, String docentAfkorting)
    {
        this.docentNaam = docent;
        this.docentAfkorting = docentAfkorting;
    }

    public String getDocentAfkorting()
    {
        return docentAfkorting;
    }
}
