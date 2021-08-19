package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeljeznickaStanica {
    private String naziv;
    private Map<Integer, Integer> kordinatePruge = new HashMap<>();
    private Map<String, Map<Integer, Integer>> kordinateKompozicija;
    private Map<Integer, Integer> kordinatePruznogPrelaza = new HashMap<>();
    private Map<Integer, Integer> kordinatePoljaPodNaponom = new HashMap<>();
    private Double brzinaKretanja;


    public boolean daLiJePruzniPrelazSlobodan() {
        // provjeravati kordinate kompozicije, kordinate polja pod naponom i kordinate pruznog prelaza da bi vidio da li je
        // prelaz slobodan
        return true;
    }

    public void propustiKompoziciju(String identifikatorKompozicije) {
        //kordinate su prvo polje na toj dionici
       // kordinateKompozicija.put(identifikatorKompozicije, prodlijdikordinate)
    }

}
