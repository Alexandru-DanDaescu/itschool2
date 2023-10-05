package session15_equalsAndHashcodeAndGenerics.challenges.checkifobjectsareequal;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

public class Lamborghini extends Cars {


    private UUID iD;
    private String carName;
    private Timestamp timestamp;


    public Lamborghini(String carName, Timestamp timestamp){
        this.iD = UUID.randomUUID();
        this.carName = carName;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Lamborghini that = (Lamborghini) obj;
        return Objects.equals(getiD(), that.getiD());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getiD());
    }

    public UUID getiD() {
        return iD;
    }

    public void setiD(UUID iD) {
        this.iD = iD;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
