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
        int telefoonLengte = telephone.length();
        if (telefoonLengte == 11)
        {
            this.telephone = telephone;
        }
        else
        {
            this.telephone = "Geen correct telefoon nummer";
        }
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        if (email.contains("@"))
        {
            this.email = email;
        }
        else
        {
            this.email = "Geen correct email addres";
        }
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
