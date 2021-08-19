package model.vagon;

public class PutnickiVagon
{
    private Integer duzina;
    private String oznaka;

    public PutnickiVagon()
    {
        super();
    }

    public PutnickiVagon(Integer duzina, String oznaka)
    {
        super();
        this.duzina = duzina;
        this.oznaka = oznaka;
    }

    public Integer getDuzina()
    {
        return duzina;
    }

    public void setDuzina()
    {
        this.duzina = duzina;
    }

    public String getOznaka()
    {
        return oznaka;
    }

    public void setOznaka()
    {
        this.oznaka = oznaka;
    }


}
