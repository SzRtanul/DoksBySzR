package hu.szamalk;

import hu.szamalk.controller.DokumentunC;
import hu.szamalk.model.Dokumentumok;
import hu.szamalk.view.DokumentumV;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new DokumentunC(new Dokumentumok(), new DokumentumV());
    }
}