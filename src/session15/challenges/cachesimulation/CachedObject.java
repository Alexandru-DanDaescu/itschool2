package session15.challenges.cachesimulation;

import java.util.Objects;

public class CachedObject {
    private String key;
    private String value;

    public CachedObject(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey(){
        return key;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CachedObject that = (CachedObject) obj;
        return Objects.equals(getKey(), that.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey());
    }

    @Override
    public String toString() {
        return "CachedObject{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
