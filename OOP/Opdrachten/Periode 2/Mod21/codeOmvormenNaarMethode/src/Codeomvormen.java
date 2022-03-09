public class Codeomvormen
{
    public static void main(String[] args)
    {
        double totaleBTW = 0;
        printandersom();
        printandersom2();
        totaleBtw(totaleBTW);
        factuurBedrag1(totaleBTW);
        factuurBedrag2(totaleBTW);


    }

    public static void printandersom()
    {
        String tekst1 = "Dit is een test";
        String andersom = "";
        for (int i = tekst1.length() - 1; i >= 0; i--)
        {
            andersom = andersom + tekst1.charAt(i);
        }
        System.out.println(andersom);
    }

    public static void printandersom2()
    {
        String tekst2 = "eem lew tseb tlav POO";
        String andersom2 = "";
        for (int i = tekst2.length() - 1; i >= 0; i--)
        {
            andersom2 = andersom2 + tekst2.charAt(i);
        }
        System.out.println(andersom2);
    }

    public static void totaleBtw(double totaleBTW)
    {

        double factuurBedrag = 190;
        double btw = factuurBedrag * 0.21;
        totaleBTW += btw;
        System.out.println("Het factuurbedrag exc. BTW is: " + factuurBedrag);
        System.out.println("De BTW is: " + btw);
        System.out.println("Het totale factuurbedrag incl. BTW is: " + (factuurBedrag + btw));
        System.out.println("De belastingdienst krijgt: " + totaleBTW);
    }

    public static void factuurBedrag1(double totaleBTW)
    {
        double factuurBedrag1 = 230.75;
        double btw1 = factuurBedrag1 * 0.21;
        totaleBTW += btw1;
        System.out.println("Het factuurbedrag exc. BTW is: " + factuurBedrag1);
        System.out.println("De BTW is: " + btw1);
        System.out.println("Het totale factuurbedrag incl. BTW is: " + (factuurBedrag1 + btw1));
        System.out.println("De belastingdienst krijgt: " + totaleBTW);
    }

    public static void factuurBedrag2(double totaleBTW)
    {
        double factuurBedrag2 = 230.75;
        double btw2 = factuurBedrag2 * 0.21;
        totaleBTW += btw2;
        System.out.println("Het factuurbedrag exc. BTW is: " + factuurBedrag2);
        System.out.println("De BTW is: " + btw2);
        System.out.println("Het totale factuurbedrag incl. BTW is: " + (factuurBedrag2 + btw2));
        System.out.println("De belastingdienst krijgt: " + totaleBTW);
    }
}