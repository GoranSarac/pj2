package model.vagon;

public class RestoranVagon extends PutnickiVagon
{
    private String opis;

    public RestoranVagon()
    {
        super();
    }

    public RestoranVagon(Integer duzina, String oznaka)
    {
        super(duzina, oznaka);
        this.opis = opis;
    }

    public String getOpis()
    {
        return opis;
    }

    public void setOpis(String opis)
    {
        this.opis = opis;
    }
}
