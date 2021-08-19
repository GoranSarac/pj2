package model.lokomotiva;

public class TeretnaLokomotiva extends Lokomotiva
{
    private final String identifikator = "TL";

    public TeretnaLokomotiva()
    {
        super();
    }

    public TeretnaLokomotiva(Pogon pogon, Integer snaga, String oznaka)
    {
        super(pogon, snaga, oznaka);
    }
}
