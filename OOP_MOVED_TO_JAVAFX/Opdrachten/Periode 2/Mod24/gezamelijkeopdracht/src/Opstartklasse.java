public class Opstartklasse
{

    public static void main(String[] args)
    {
        Aquarium aquarium= new Aquarium();

        aquarium.setMerk("Aquarium.inc");
        aquarium.setDiepte(20);
        aquarium.setHoogte(30);
        aquarium.setBreedte(15);
        aquarium.setAantalVissen(20);
        aquarium.setChangeaantalvissen(40);
        aquarium.print();


    }

}