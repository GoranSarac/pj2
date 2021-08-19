package model.vagon;

public class PosebneNamjeneVagon
{
    private Integer duzina;
    private String oznaka;

    public PosebneNamjeneVagon()
    {
        super();
    }

    public PosebneNamjeneVagon(Integer duzina, String oznaka)
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

