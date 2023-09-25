package session18.recap.exercise7;

public class Pair<T, U> {

    private final T key;
    private final U value;

    public Pair(T key, U value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        if (key instanceof StringBuilder) {
            return (T) new StringBuilder(((StringBuilder) key).toString());
        }
        return key;
    }

    public U getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
