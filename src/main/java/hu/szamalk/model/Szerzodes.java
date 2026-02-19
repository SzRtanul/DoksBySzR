package hu.szamalk.model;

import java.sql.Timestamp;

public class Szerzodes extends Dok{
    private long szerzodoFelekSzama;

    public Szerzodes(long azon, String cim, Timestamp letrehoz, long szerzodoFelekSzama) {
        super(azon, cim, letrehoz);
        this.szerzodoFelekSzama = szerzodoFelekSzama;
    }

    public long getSzerzodoFelekSzama() {
        return szerzodoFelekSzama;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Szerzodes szerzodes = (Szerzodes) o;
        return szerzodoFelekSzama == szerzodes.szerzodoFelekSzama;
    }

    @Override
    public String toString() {
        return "Szerzodes{" +
                "szerzodoFelekSzama=" + szerzodoFelekSzama +
                '}'+super.toString();
    }
}
