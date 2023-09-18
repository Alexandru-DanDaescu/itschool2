package session15.challenges.checkifobjectsareequal;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

public class Opel extends Lamborghini{


    private UUID iD;
    public Opel(String carName, Timestamp timestamp) {
        super(carName, timestamp);
        this.iD = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Opel opel = (Opel) obj;
        return Objects.equals(getiD(), opel.getiD());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getiD());
    }

    @Override
    public UUID getiD() {
        return iD;
    }

    @Override
    public void setiD(UUID iD) {
        this.iD = iD;
    }
}
