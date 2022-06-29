public class Mod23_2
{
    public static void main(String[] args)
    {
        Tafel tafel1 = new Tafel();

        tafel1.setLengte("160");
        tafel1.setBreedte("80");
        tafel1.setHoogte("100");


        System.out.println(tafel1.getNaam());
        System.out.println(tafel1.getLengte());
        System.out.println(tafel1.getBreedte());
        System.out.println(tafel1.getHoogte());
    }
}
