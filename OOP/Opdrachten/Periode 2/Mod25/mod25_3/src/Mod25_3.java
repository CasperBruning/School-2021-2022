public class Mod25_3
{
    public static void main(String[] args)
    {
        Motorfiets motorfiets1 = new Motorfiets();
        Kofferset kofferset1 = new Kofferset();
        motorfiets1.setKofferset(kofferset1);

        motorfiets1.setMerk("Suzuki");
        motorfiets1.setModel("V-Strom");
        motorfiets1.setCilinderInhoud(1000);

        kofferset1.setMerk("Givi Trekker");
        kofferset1.setInhoud("40 Liter");



        System.out.println(motorfiets1);
    }
}
