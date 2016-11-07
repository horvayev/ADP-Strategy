package strategy;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Kontejner pro ukladani dat s LRU strategii odebirani prvku.
 * Rozsireni pro LinkedHashMap.
 * @author mrakapet
 * @param <Key>
 * @param <Value> 
 */
public class LRUStore<Key, Value> extends LinkedHashMap {
    
    /** Pevna kapacita kontejneru. */
    protected final int capacity;
    
    /**
     * Vytvoreni kontejneru s pevnou kapacitou.
     * @param capacity - kapacita kontejneru
     */
    public LRUStore(int capacity) {
        super(capacity, 1, true);
        this.capacity = capacity;        
    }
    
    /**
     * Pokud je do kontejneru vkladan novy prvek, metoda overuje, zda je
     * je kontejner zaplnen. Pokud ano, je pomoci algoritmu LRU jeden prvek
     * z kontejneru odebran.
     * @param eldest - novy prvek
     * @return TRUE pokud je kontejner naplnen
     */
    @Override
    protected boolean removeEldestEntry(Entry eldest) {
        return this.size() > this.capacity;
    }
        
    /**
     * Vypis kontejneru.
     * @return serializovany obsah kontejneru
     */
    @Override
    public String toString() {
        String rv = "[";       
        
        Set<Entry<Key,Value>> entries = this.entrySet();
        for(Entry<Key, Value> entry : entries) {      
            rv += "{ key: " + entry.getKey() + ", value: " + entry.getValue()  + " }\n";
        }
                        
        rv = rv.substring(0, rv.length() - 2);
        rv += "]";
        return rv;
    }
    
}
