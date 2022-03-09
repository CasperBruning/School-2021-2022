public class Motorfiets
{
    private String merk;
    private String model;
    private int cilinderInhoud;
    private Kofferset kofferset;

    public String getMerk()
    {
        return merk;
    }

    public void setMerk(String merk)
    {
        this.merk = merk;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getCilinderInhoud()
    {
        return cilinderInhoud;
    }

    public void setCilinderInhoud(int cilinderInhoud)
    {
        this.cilinderInhoud = cilinderInhoud;
    }

    public void setKofferset(Kofferset kofferset)
    {
        this.kofferset = kofferset;
    }

    public Kofferset getKofferset()
    {
        return kofferset;
    }

    public String toString()
    {
        return "Merk: " + merk + "\n" +
                "Model" + model + "\n" +
                "CilinderInhoud: " + "\n" +
                "Kofferset merk: " + kofferset.getMerk() + "\n" +
                "Koffer inhoud: " + kofferset.getInhoud() + "\n";
    }
}
