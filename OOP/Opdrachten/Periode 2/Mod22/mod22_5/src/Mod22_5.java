public class Mod22_5
{
    public static void main(String[] args)
    {
        Lamp lamp = new Lamp();
        lamp.setStatus("uit");
        lamp.setLichtsterkte(0);
        System.out.println(lamp.getLichtsterkte());
        System.out.println(lamp.getStatus());
    }
}
