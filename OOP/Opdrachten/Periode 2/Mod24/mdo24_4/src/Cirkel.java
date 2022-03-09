public class Cirkel
{
    private double radius;
    private double diameter;
    private String kleur;

    public void setRadius(double radius)
    {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public void setDiameter(double diameter)
    {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    public void setKleur(String kleur)
    {
        this.kleur = kleur;
    }

    public double getRadius()
    {
        return  radius;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public String getKleur()
    {
        return kleur;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    public void print()
    {
        System.out.println("Deze cirkel heeft een diameter van " + getDiameter() + " meter en een Oppervlakte van " + getArea() + " meter2 en is " + kleur);
    }

}
