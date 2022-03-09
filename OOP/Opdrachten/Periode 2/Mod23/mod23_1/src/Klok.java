public class Klok
{
    private String tijd;

    public Klok()
    {
        this.tijd = "12:00";
    }

    public void setTijd(String tijd)
    {
        this.tijd = tijd;
    }

    public String getTijd(){
        return tijd;

    }
    public void print(){
        System.out.println(tijd);
    }
}
