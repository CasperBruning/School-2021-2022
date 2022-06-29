public class Mod22_1
{
    public static void main(String[] args)
    {
        Tafel salontafel = new Tafel();
        Tafel eettafel = new Tafel();

        salontafel.lengte = 1;
        salontafel.breedte = 1;

        eettafel.lengte= 1.2;
        eettafel.breedte = 1.8;



        System.out.println("Salontafel");
        System.out.println("Deze heeft een lengte van " + salontafel.lengte + " meter");
        System.out.println("Deze heeft een breedte van " + salontafel.breedte + " meter");
        System.out.println("");
        System.out.println("Eettafel");
        System.out.println("Deze heeft een lengte van " + eettafel.lengte + " meter");
        System.out.println("Deze heeft een breedte van " + eettafel.breedte + " meter");
    }
}
