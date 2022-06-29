public class Person
{
    private String name;
    private String birthdate;
    private String address;
    private String telephone;
    private String email;

    public Person(String naam)
    {
        this.name = naam;
    }

    public String getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(String birthdate)
    {
        this.birthdate = birthdate;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
            this.email = email;
    }

    public void print()
    {
        System.out.println("Naam: " + name);
        System.out.println("Geboortedatum: " + birthdate);
        System.out.println("Address: " + address);
        System.out.println("Telefoonnummer: " + telephone);
        System.out.println("Email: " + email);
    }
}
