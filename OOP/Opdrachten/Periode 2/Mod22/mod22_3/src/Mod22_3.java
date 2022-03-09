public class Mod22_3
{
    public static void main(String[] args)
    {
        Koffie cappucino = new Koffie();
        Koffie lungo = new Koffie();

        cappucino.soort = "cappucino";
        cappucino.kleur = "wit";
        cappucino.inhoudInMl = 250;

        lungo.soort = "lungo";
        lungo.kleur = "zwart";
        lungo.inhoudInMl = 100;

        print(cappucino.soort, cappucino.kleur, cappucino.inhoudInMl);
        print(lungo.soort, lungo.kleur, lungo.inhoudInMl);
    }
    public static void print(String soort, String kleur, int inhoudInMl)
    {
        System.out.println("Koffiekop: " + soort);
        System.out.println("Kleur: " + kleur);
        System.out.println("Inhoud: " + inhoudInMl);
    }
}
