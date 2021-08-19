package model.lokomotiva;

public class UniverzalnaLokomotiva extends Lokomotiva {

    private final String identifikator = "UL";

    public UniverzalnaLokomotiva()
    {
        super();
    }

    public UniverzalnaLokomotiva(Pogon pogon, Integer snaga, String oznaka)
    {
        super(pogon, snaga, oznaka);
    }
}
