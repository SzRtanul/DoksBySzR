package hu.szamalk.controller;

import hu.szamalk.model.BirHat;
import hu.szamalk.model.Dokumentumok;
import hu.szamalk.model.Szerzodes;
import hu.szamalk.view.DokumentumV;

import java.sql.Timestamp;

public class DokumentunC {
    public DokumentunC(Dokumentumok model, DokumentumV view){
        model.addDok(new BirHat(1,"", new Timestamp(1234), 13));
        model.addDok(new Szerzodes(2,"", new Timestamp(1234), 13));
        view.view(model.getDoks());
    }
}
