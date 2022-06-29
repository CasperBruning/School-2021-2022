public class Lamp
{
    String status;
    int lichtsterkte;


    //Status
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        String output = "De lamp is: " + status;
        return output;
    }


    //Lichtsterkte
    public void setLichtsterkte(int lichtsterkte)
    {
        this.lichtsterkte = lichtsterkte;
    }

    public String getLichtsterkte()
    {
        String output = "De lichtsterkte is " + lichtsterkte + "%";
        return output;
    }
}
