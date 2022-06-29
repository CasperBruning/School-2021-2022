public class StartUp
{
    public static void main(String[] args)
    {
        DagRooster maandagRooster = new DagRooster("maandag 24 januari 2022");

        Docent korbee = new Docent("Korbee", "KBE");
        Docent peters = new Docent("Peters", "PSH");

        Vak php = new Vak("PHP");
        php.setLokaal("T308");
        php.setStartTijd("8:40");
        php.setStopTijd("10:10");
        php.setDocent(peters);

        Vak oop = new Vak("OOP");
        oop.setLokaal("T204");
        oop.setStartTijd("10:30");
        oop.setStopTijd("12:00");
        oop.setDocent(korbee);

        maandagRooster.setBlok1(string.valueOf(php));
        maandagRooster.setBlok2(String.valueOf(oop));

        System.out.println(maandagRooster);
    }
}