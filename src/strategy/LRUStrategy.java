package strategy;

/**
 * Implementace cache pomoci strategie LRU. Prvkz jsou vkladany do vlastniho
 * uloziste, ktere pri zaplneni odebira prvky algoritmem LRU.
 * @author mrakapet
 */
public class LRUStrategy extends CacheStrategy{

    /** Uloziste prvku implementujici LRU strategii odmazavani prvku. */
    private LRUStore<Key, Value> store;
    
    /**
     * Inicializace uloziste cache a nastaveni pevne velikosti cache.
     * @param maxSize
     */
    public LRUStrategy(int maxSize) {
        super(maxSize);
        store = new LRUStore<>(maxSize);
    }
    
    /**
     * Vlozeni prvku do cache.
     * @param key
     * @param value 
     */
    @Override
    public void put(Key key, Value value) {
        store.put(key, value);
    }

    /**
     * Nacteni prvku z cache.
     * Pokud je prvek pritomen je zapocitan prisup k nemu,
     * @param key
     * @return prvek odpovidajici klici key nebo null
     */
    @Override
    public Value get(Key key) {
        return (Value)store.get(key);
    }
    
    @Override
    public String toString() {
        return store.toString();
    }
    
}
