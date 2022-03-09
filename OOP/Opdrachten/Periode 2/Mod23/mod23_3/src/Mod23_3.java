public class Mod23_3
{
    public static void main(String[] args)
    {
        Tafel tafel1 = new Tafel("Ikea");

        tafel1.setLengte("160");
        tafel1.setBreedte("80");
        tafel1.setHoogte("100");


        print(tafel1.getNaam(), tafel1.getLengte(), tafel1.getBreedte(), tafel1.getHoogte());
    }

    public static void print(String naam, String lengte, String breedte, String hoogte)
    {
        System.out.println(naam);
        System.out.println(lengte);
        System.out.println(breedte);
        System.out.println(hoogte);
    }
}
