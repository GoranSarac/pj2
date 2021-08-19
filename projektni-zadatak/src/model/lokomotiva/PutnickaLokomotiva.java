package model.lokomotiva;

public class PutnickaLokomotiva extends Lokomotiva
{
    private final String identifikator = "PL";

    public PutnickaLokomotiva()
    {
        super();
    }

    public PutnickaLokomotiva(Pogon pogon, Integer snaga, String oznaka)
    {
        super(pogon, snaga, oznaka);
    }
}
