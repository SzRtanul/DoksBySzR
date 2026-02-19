package hu.szamalk.view;

import hu.szamalk.model.Dok;
import java.util.Set;

public class DokumentumV {
    public void view(Set<Dok> doks){
        for(Dok dok : doks){
            System.out.println(doks);
        }
    }
}
