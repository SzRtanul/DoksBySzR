package hu.szamalk.model;

import java.io.*;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public final class Dokumentumok implements Serializable {
    Set<Dok> doks;
    String file;

    public Dokumentumok(){
        file = "doks.f";
        doks = new HashSet<>();
    }

    public boolean addDok(Dok dok){
        return doks.add(dok);
    }

    public Dok getDok(int azon){
        Dok dokum = doks.stream().filter(x -> x.getAzon() == azon).findFirst().orElse(null);
        return dokum;
    }

    public Set<Dok> getDoks(){
        Set<Dok> nDoks = new HashSet<>();
        for (Dok dok : doks){
            nDoks.add(dok);
        }
        return nDoks;
    }

    public String save(){
        try{
            //URL resourceUrl = getClass().getResource("/");
            File f = new File(file);
            if(!f.exists()){
                f.createNewFile();
            }
            OutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(doks);
            return "";
        }
        catch (Exception e){
            return e.getMessage();
        }
    }

    public String load(){
        try{
            File f = new File(file);
            InputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            doks = (HashSet<Dok>)(ois.readObject());
            return "";
        }
        catch (Exception e){
            return e.getMessage();
        }
    }
}
