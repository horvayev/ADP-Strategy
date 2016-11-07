package strategy;

/**
 * Podtrida Value realizovana jako retezec.
 * @author mrakapet
 */
public class StringValue extends Value{
    private String value;

    public StringValue(String value) {
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
        final StringValue other = (StringValue) obj;
        if (value != other.getValue())
            return false;
        return true;
    }
}
