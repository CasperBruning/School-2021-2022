public class Flight
{
    private String flightcode;
    private String from;
    private String to;
    private String departureTime;
    private int duration;

    //constructor
    public Flight(String flightcode)
    {
        this.flightcode = flightcode;
    }

    //from
    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getFrom()
    {
        return from;
    }

    //to
    public void setTo(String to)
    {
        this.to = to;
    }

    public String getTo()
    {
        return to;
    }

    //departuretime
    public void setDepartureTime(String departureTime)
    {
        this.departureTime = departureTime;
    }

    public String getDepartureTime()
    {
        return departureTime;
    }

    //duration
    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public int getDuration()
    {
        return duration;
    }

    //print
    public void print()
    {
        System.out.println("Flightcode: " + flightcode);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Duration: " + duration);
    }
}
