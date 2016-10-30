package strategy;

/**
 * Created by Evzen on 30.10.2016.
 */
public class IntKey extends Key {
    private int value;

    public IntKey(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + this.value + "}";
    }

    @Override
    public int hashCode() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final IntKey other = (IntKey) obj;
        if (value != other.getValue())
            return false;
        return true;
    }
}
