package model.vagon;

public class LezajVagon extends PutnickiVagon
{
    private Integer brojMjesta;

    public LezajVagon()
    {
        super();
    }

    public LezajVagon(Integer duzina, String oznaka)
    {
        super(duzina, oznaka);
        this.brojMjesta = brojMjesta;
    }

    public Integer getBrojMjesta()
    {
        return brojMjesta;
    }

    public void setBrojMjesta(Integer brojMjesta)
    {
        this.brojMjesta = brojMjesta;
    }
}
