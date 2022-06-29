public class Mod23_1
{
    public static void main(String[] args)
    {
        Klok klok1 = new Klok();

//        System.out.println(klok1.getTijd());
        klok1.print();


        klok1.setTijd("23:59");

//        System.out.println(klok1.getTijd());
        klok1.print();

    }
}
