public class Mod23_8
{
    public static void main(String[] args)
    {
        Computer computer1 = new Computer("uit", "uit");
        computer1.print();

        computer1.setComputerStatus("aan");
        computer1.setMonitorStatus("uit");
        computer1.print();

        computer1.setComputerStatus("aan");
        computer1.setMonitorStatus("aan");
        computer1.print();

        computer1.setComputerStatus("uit");
        computer1.setMonitorStatus("aan");
        computer1.print();


    }
}
