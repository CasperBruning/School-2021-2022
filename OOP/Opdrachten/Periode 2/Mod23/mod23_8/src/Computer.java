public class Computer
{
    private String computerStatus;
    private String monitorStatus;

    //constructor
    public Computer(String computerStatus, String monitorStatus)
    {
        if (computerStatus.equals("uit") && monitorStatus.equals("uit"))
        {
            this.computerStatus = "uit";
            this.monitorStatus = "uit";
        }
        else
        {
            this.computerStatus = computerStatus;
            this.monitorStatus = monitorStatus;
        }
    }

    //computerstatus
    public void setComputerStatus(String computerStatus)
    {
        this.computerStatus = computerStatus;
    }

    public String getComputerStatus()
    {
        return computerStatus;
    }

    //monitorstatus
    public void setMonitorStatus(String monitorStatus)
    {
        if (computerStatus.equals("uit") && monitorStatus.equals("aan"))
        {
            this.monitorStatus = "uit";
        }
        else
        {
            this.monitorStatus = "aan";
        }
    }

    public String getMonitorStatus()
    {
        return monitorStatus;
    }

    //print
    public void print()
    {
        System.out.println("Computerstatus: " + computerStatus);
        System.out.println("Monitorstatus: " + monitorStatus);
        System.out.println();
    }
}
