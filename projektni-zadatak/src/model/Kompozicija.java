package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Kompozicija implements Runnable {
    private String identifikator;
    private Double brzinaKretanja;
    private PravacKretanja pravacKretanja;
    private char izvorisnaStanica;
    private char odredisnaStanica;
    private ArrayList<Koordinata> pruga;

    public Kompozicija(char izvorisnaStanica, char odredisnaStanica, ArrayList<Koordinata> pruga)
    {
        this.izvorisnaStanica = izvorisnaStanica;
        this.odredisnaStanica = odredisnaStanica;
        this.pruga = pruga;
    }

    public char getIzvorisnaStanica() {
        return izvorisnaStanica;
    }

    public void setIzvorisnaStanica(char izvorisnaStanica) {
        this.izvorisnaStanica = izvorisnaStanica;
    }

    public char getOdredisnaStanica() {
        return odredisnaStanica;
    }

    public void setOdredisnaStanica(char odredisnaStanica) {
        this.odredisnaStanica = odredisnaStanica;
    }

    public ArrayList<Koordinata> getPruga() {
        return pruga;
    }

    public void setPruga(ArrayList<Koordinata> pruga) {
        this.pruga = pruga;
    }

    public String getIdentifikator() {
        return identifikator;
    }

    @Override
    public void run() {
        Iterator<Koordinata> polozaj = pruga.iterator();
        while(polozaj.hasNext())
        {
            Koordinata trenutnoPolje = polozaj.next();
            System.out.println(trenutnoPolje.toString());
        }
    }
}
