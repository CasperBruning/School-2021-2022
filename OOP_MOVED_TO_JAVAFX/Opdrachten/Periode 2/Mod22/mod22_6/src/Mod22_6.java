public class Mod22_6
{
    public static void main(String[] args)
    {
        Telefoon telefoon1 = new Telefoon();
        Telefoon telefoon2 = new Telefoon();

        telefoon1.setMerk("Apple");
        telefoon1.setType("Iphone 12");
        telefoon1.setPrijs("812,10");

        telefoon2.setMerk("Samsung");
        telefoon2.setType("Galaxy S21 Ultra 5G");
        telefoon2.setPrijs("1249,00");

        System.out.println(telefoon1.getMerk());
        System.out.println(telefoon1.getType());
        System.out.println(telefoon1.getPrijs());
        System.out.println("");
        System.out.println(telefoon2.getMerk());
        System.out.println(telefoon2.getType());
        System.out.println(telefoon2.getPrijs());
    }
}















