public class Cirkel
{
    private double radius;
    private double diameter;

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

    public double getRadius()
    {
        return  radius;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    public void print()
    {
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Oppervlakte: " + getArea());
    }

}
