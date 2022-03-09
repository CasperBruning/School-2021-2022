public class Mod22_2
{
    public static void main(String[] args)
    {
        Tafel salontafel = new Tafel();
        Tafel eettafel = new Tafel();

        salontafel.type = "salontafel";
        salontafel.lengte = 1;
        salontafel.breedte = 1;

        eettafel.type = "eettafel";
        eettafel.lengte= 1.2;
        eettafel.breedte = 1.8;


        print(salontafel.type,salontafel.lengte, salontafel.breedte);
        print(eettafel.type,eettafel.lengte, eettafel.breedte);

    }
    public static void print(String type,double lengte,double breedte)
    {
        System.out.println(type);
        System.out.println("Deze heeft een lengte van " + lengte + " meter");
        System.out.println("Deze heeft een breedte van " + breedte + " meter");
        double oppervlakte = lengte * breedte;
        System.out.println("Deze heeft een oppervlakte van " + oppervlakte + " m2");

    }
    }
























//        System.out.println("Salontafel");
//        System.out.println("Deze heeft een lengte van " + salontafel.lengte + " meter");
//        System.out.println("Deze heeft een breedte van " + salontafel.breedte + " meter");
//        System.out.println("Deze heeft een oppervlakte van " + salontafel.oppervlakte + " m2");
//
//        System.out.println("");
//        System.out.println("Eettafel");
//        System.out.println("Deze heeft een lengte van " + eettafel.lengte + " meter");
//        System.out.println("Deze heeft een breedte van " + eettafel.breedte + " meter");
//        System.out.println("Deze heeft een oppervlakte van " + eettafel.oppervlakte + " m2");