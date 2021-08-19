package model.lokomotiva;

public class ManevarskaLokomotiva extends Lokomotiva
{

    public static final String identifikator = "ML";

    public ManevarskaLokomotiva()
    {
        super();
    }

    public ManevarskaLokomotiva(Pogon pogon, Integer snaga, String oznaka)
    {
        super(pogon, snaga, oznaka);
    }

}
