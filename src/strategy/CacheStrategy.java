package strategy;

/**
 * Created by Evzen on 30.10.2016.
 */
public interface CacheStrategy {
    void put(Key key, Value value);
    Value get(Key key);
}
