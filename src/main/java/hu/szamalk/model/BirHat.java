package hu.szamalk.model;

import java.sql.Timestamp;

public class BirHat extends Dok{
    private long ugyszam;

    public BirHat(long azon, String cim, Timestamp letrehoz, long ugyszam) {
        super(azon, cim, letrehoz);
        this.ugyszam = ugyszam;
    }

    public long getUgyszam() {
        return ugyszam;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BirHat birHat = (BirHat) o;
        return ugyszam == birHat.ugyszam;
    }
}
