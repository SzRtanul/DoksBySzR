package hu.szamalk.controller;

import hu.szamalk.model.Dokumentumok;
import hu.szamalk.view.DokumentumV;

public class DokumentunC {
    public DokumentunC(Dokumentumok model, DokumentumV view){
        view.view(model.getDoks());
    }
}
