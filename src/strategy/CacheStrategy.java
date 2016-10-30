package strategy;

/**
 * Created by Evzen on 30.10.2016.
 */
public abstract class CacheStrategy {
    protected int maxSize;

    public abstract void put(Key key, Value value);
    public abstract Value get(Key key);

    public int getMaxSize() {
        return maxSize;
    }
}
