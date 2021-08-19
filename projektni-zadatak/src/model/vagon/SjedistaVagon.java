package model.vagon;

public class SjedistaVagon extends PutnickiVagon
{
    private Integer brojMjesta;

    public SjedistaVagon()
    {
        super();
    }

    public SjedistaVagon(Integer duzina, String oznaka)
    {
        super(duzina, oznaka);
        this.brojMjesta = brojMjesta;
    }

    public Integer getBrojMjesta()
    {
        return brojMjesta;
    }

    public void setBrojMjesta()
    {
        this.brojMjesta = brojMjesta;
    }
}
