package strategy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Evzen on 02.11.2016.
 */
public class FifoStrategy extends  CacheStrategy {

    private LinkedHashMap<Key, Value> store;

    public FifoStrategy(int maxSize) {
        super(maxSize);
        store = new LinkedHashMap<>(maxSize);
    }

    @Override
    public void put(Key key, Value value) {
        if(!store.containsKey(value)) {
            if(store.size() < maxSize) {
                store.put(key, value);
            } else {
                store.remove(store.keySet().iterator().next());
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
