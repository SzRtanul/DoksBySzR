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
    void duplicated(){
        Assertions.assertTrue(dokumentumok.addDok(new BirHat(13, "YEP", new Timestamp(13123), 234)));
        Assertions.assertFalse(dokumentumok.addDok(new BirHat(13, "YEP", new Timestamp(13123), 234)));
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
}
