package strategy;

/**
 * Created by Evzen on 30.10.2016.
 */
public class IntValue extends  Value {

    private int value;

    public IntValue(int value) {
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
        final IntValue other = (IntValue) obj;
        if (value != other.getValue())
            return false;
        return true;
    }
}
