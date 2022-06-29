public class mod24_5
{
    public static void main(String[] args)
    {
        Auto toyota = new Auto("Toyota");
        Auto volvo = new Auto("Volvo");

        toyota.setKleur("wit");
        toyota.setMaxSnelheid(150);
        toyota.setHuidigeSnelheid(80);

        volvo.setKleur("zwart");
        volvo.setMaxSnelheid(150);
        volvo.setHuidigeSnelheid(80);

        toyota.print();
        volvo.print();
    }
}
