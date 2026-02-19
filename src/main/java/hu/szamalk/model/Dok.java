package hu.szamalk.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public abstract class Dok implements Serializable {
    private long azon;
    private String cim;
    private Timestamp letrehoz;

    public Dok(long azon, String cim, Timestamp letrehoz) {
        this.azon = azon;
        this.cim = cim;
        this.letrehoz = letrehoz;
    }

    public long getAzon() {
        return azon;
    }

    public String getCim() {
        return cim;
    }

    public Timestamp getLetrehoz() {
        return letrehoz;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dok dok = (Dok) o;
        return azon == dok.azon && Objects.equals(cim, dok.cim) && Objects.equals(letrehoz, dok.letrehoz);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(azon);
    }

    @Override
    public String toString() {
        return "Dok{" +
                "azon=" + azon +
                ", cim='" + cim + '\'' +
                ", letrehoz=" + letrehoz +
                '}';
    }
}
