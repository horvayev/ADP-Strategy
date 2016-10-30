package strategy;

/**
 * Created by Evzen on 30.10.2016.
 */
public class Cache {
    private CacheStrategy strategy;

    public Cache(CacheStrategy strategy) {
        this.strategy = strategy;
    }

    public void put(Key key, Value value) {
        strategy.put(key, value);
    }

    public Value get(Key key) {
        return strategy.get(key);
    }

    @Override
    public String toString() {
        return strategy.toString();
    }
}
