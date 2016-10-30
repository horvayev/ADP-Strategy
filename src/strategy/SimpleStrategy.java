package strategy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Evzen on 30.10.2016.
 */
public class SimpleStrategy implements CacheStrategy {
    private int maxSize;
    private LinkedHashMap<Key, Value> store;

    public SimpleStrategy(int maxSize) {
        this.maxSize = maxSize;
        store = new LinkedHashMap<>(maxSize);
    }

    @Override
    public void put(Key key, Value value) {
        if(!store.containsKey(value)) {
            if(store.size() < maxSize) {
                store.put(key, value);
            } else {
                store.remove(store.keySet().stream().findFirst().get());
                store.put(key, value);
            }
        }
    }

    @Override
    public Value get(Key key) {
        return store.get(key);
    }

    @Override
    public String toString() {
        String rv = "[";
        for(Map.Entry<Key, Value> entry : store.entrySet()) {
            rv += "{ key: " + entry.getKey() + ", value: " + entry.getValue()  + " }\n";
        }
        rv = rv.substring(0, rv.length() - 2);
        rv += "]";
        return rv;
    }
}
