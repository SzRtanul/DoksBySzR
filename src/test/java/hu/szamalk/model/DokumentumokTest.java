package hu.szamalk.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

public class DokumentumokTest {
    Dokumentumok dokumentumok;

    @BeforeEach
    void beforeOp(){
        dokumentumok = new Dokumentumok();
    }

    @Test
    void addSzerzodes(){
        dokumentumok.addDok(new Szerzodes(15, "B", new Timestamp(13), 0));
        Assertions.assertEquals(dokumentumok.getDoks().size(), 1);
    }

    @Test
    void addBirHat(){
        dokumentumok.addDok(new BirHat(15, "B", new Timestamp(13), 0));
        Assertions.assertEquals(dokumentumok.getDoks().size(), 1);
    }

    @Test
    void duplicated(){
        Assertions.assertTrue(dokumentumok.addDok(new BirHat(13, "YEP", new Timestamp(13123), 234)));
        Assertions.assertFalse(dokumentumok.addDok(new BirHat(13, "YEP", new Timestamp(13123), 234)));
    }

    @Test
    void searchExist(){
        dokumentumok.addDok(new BirHat(13, "B", new Timestamp(13), 0));
        Assertions.assertNotNull(dokumentumok.getDok(13));
    }

    @Test
    void searchNotExist(){
        dokumentumok.addDok(new BirHat(13, "B", new Timestamp(13), 0));
        Assertions.assertEquals(null, dokumentumok.getDok(14));
    }

    @Test
    void getAllDoks(){
        dokumentumok.addDok(new BirHat(13, "B", new Timestamp(13), 0));
        dokumentumok.addDok(new BirHat(14, "B", new Timestamp(13), 0));
        dokumentumok.addDok(new BirHat(15, "B", new Timestamp(13), 0));
        Assertions.assertEquals(dokumentumok.getDoks().size(), 3);
    }

    @Test
    void loadAndSave(){
        dokumentumok.addDok(new BirHat(13, "YEP", new Timestamp(13123), 234));
        String s = dokumentumok.save();
        System.out.println("Save: " + s);
        Dokumentumok doks2 = new Dokumentumok();
        String l = doks2.load();
        System.out.println("Load: " + l);
        Assertions.assertEquals(dokumentumok.getDoks().size(), doks2.getDoks().size());
    }

    @Test
    void checkEquals(){
        Assertions.assertFalse(new BirHat(13, "A", new Timestamp(13), 0).equals(new BirHat(13, "B", new Timestamp(13), 0)));
    }
}
