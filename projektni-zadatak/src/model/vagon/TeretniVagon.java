package model.vagon;

public class TeretniVagon
{
    private Integer maksimalnaNosivost;
    private Integer duzina;
    private String oznaka;

    public TeretniVagon()
    {
        super();
    }

    public TeretniVagon(Integer maksimalnaNosivost, Integer duzina, String oznaka)
    {
        super();
        this.maksimalnaNosivost = maksimalnaNosivost;
        this.duzina = duzina;
        this.oznaka = oznaka;
    }

    public Integer getMaksimalnaNosivost()
    {
        return maksimalnaNosivost;
    }

    public void setMaksimalnaNosivost(Integer maksimalnaNosivost)
    {
        this.maksimalnaNosivost = maksimalnaNosivost;
    }

    public Integer getDuzina()
    {
        return duzina;
    }

    public void setDuzina(Integer duzina)
    {
        this.duzina = duzina;
    }

    public String getOznaka()
    {
        return oznaka;
    }

    public void setOznaka(String oznaka)
    {
        this.oznaka = oznaka;
    }
}
