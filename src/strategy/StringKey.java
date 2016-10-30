package strategy;

/**
 * Created by Evzen on 30.10.2016.
 */
public class StringKey extends Key {
    private String value;

    public StringKey(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + this.value + "}";
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final StringKey other = (StringKey) obj;
        if (value != other.getValue())
            return false;
        return true;
    }
}
