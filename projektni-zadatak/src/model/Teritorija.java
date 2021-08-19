package model;

import java.util.ArrayList;

public class Teritorija
{
    private ArrayList<Koordinata> prugaAB;
    private ArrayList<Koordinata> prugaBC;
    private ArrayList<Koordinata> prugaCE;
    public Teritorija()
    {
        prugaAB = new ArrayList<>();
        formirajPruguAB();
    }

    public void formirajPruguAB()
    {
        for(int i = 27;i > 15 ;i--)
        {
            prugaAB.add(new Koordinata(2,i));
        }

        for(int j = 3; j < 6;j++)
        {
            prugaAB.add(new Koordinata(j,16));
        }

        for(int i = 15; i > 5;i--)
        {
            prugaAB.add(new Koordinata(5,i));
        }
        prugaAB.add(new Koordinata(6,6));
    }

    public void formirajPruguBC()
    {
        for(int j = 7; j < 20; j++)
        {
            prugaBC.add(new Koordinata(j,6));
        }

        for(int i = 7; i < 13; i++)
        {
            prugaBC.add(new Koordinata(19, i));
        }
    }

    public void formirajPruguCE()
    {
        for(int i = 13; i < 19; i++)
        {
            prugaCE.add(new Koordinata(20, i));
        }

        for(int j = 20; j < 27; j++)
        {
            prugaCE.add(new Koordinata(j, 18));
        }

        for(int i = 19; i < 26; i++)
        {
            prugaCE.add(new Koordinata(26, i));
        }
    }

    public  ArrayList<Koordinata> getPruga(char trenutnaStanica, char odredisnaStanica)
    {
        if((trenutnaStanica == 'A' && odredisnaStanica == 'B') || (trenutnaStanica == 'B' && odredisnaStanica == 'A'))
            return prugaAB;
        if((trenutnaStanica == 'B' && odredisnaStanica == 'C') || (trenutnaStanica == 'C' && odredisnaStanica == 'B'))
            return prugaBC;
        if((trenutnaStanica == 'C' && odredisnaStanica == 'E') || (trenutnaStanica == 'E' && odredisnaStanica == 'C'))
            return prugaCE;
    }
}
