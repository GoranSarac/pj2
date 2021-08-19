package model.lokomotiva;

public class Lokomotiva
{
    private Pogon pogon;
    private Integer snaga;
    private String oznaka;

    public Lokomotiva()
    {
        super();
    }

    public Lokomotiva(Pogon pogon, Integer snaga, String oznaka)
    {
        super();
        this.pogon = pogon;
        this.snaga = snaga;
        this.oznaka = oznaka;
    }

    public Pogon getPogon()
    {
        return pogon;
    }

    public void setPogon(Pogon pogon)
    {
        this.pogon = pogon;
    }

    public Integer getSnaga()
    {
        return snaga;
    }

    public void setSnaga(Integer snaga)
    {
        this.snaga = snaga;
    }

    public String getOznaka()
    {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }
}
