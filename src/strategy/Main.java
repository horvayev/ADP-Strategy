package strategy;

public class Main {

    /**
     * Testy strategii Cache.
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("Fifo Strategy - simple input");
        Cache cache1 = new Cache(new FifoStrategy(4));
        cache1.put(new IntKey(0), new StringValue("A"));
        cache1.put(new IntKey(1), new StringValue("B"));
        cache1.put(new IntKey(2), new StringValue("C"));
        cache1.put(new IntKey(3), new StringValue("D"));
        System.out.println(cache1);
        System.out.println();
        cache1.put(new IntKey(4), new StringValue("E"));        
        cache1.put(new IntKey(5), new StringValue("F"));        
        System.out.println(cache1);
        System.out.println();

        System.out.println("Fifo Strategy - mixed input");
        Cache cache2 = new Cache(new FifoStrategy(4));
        cache2.put(new StringKey("ab"), new PersonValue("John", 21));
        cache2.put(new StringKey("cd"), new PersonValue("Jake", 22));
        cache2.put(new StringKey("ef"), new PersonValue("Jane", 23));
        cache2.put(new StringKey("gh"), new PersonValue("Judi", 24));
        System.out.println(cache2);
        System.out.println();               
        cache2.put(new StringKey("ij"), new PersonValue("Julia", 25));        
        cache2.put(new StringKey("kl"), new PersonValue("Jill", 26));
        System.out.println(cache2);
        System.out.println();
        
        System.out.println("LRU Strategy - simple input");
        Cache cache3 = new Cache(new LRUStrategy(4));
        cache3.put(new IntKey(0), new StringValue("A"));
        cache3.put(new IntKey(1), new StringValue("B"));
        cache3.put(new IntKey(2), new StringValue("C"));
        cache3.put(new IntKey(3), new StringValue("D"));
        System.out.println(cache3);
        System.out.println();
        cache3.put(new IntKey(4), new StringValue("E"));
        cache3.put(new IntKey(3), new StringValue("D"));        
        cache3.put(new IntKey(5), new StringValue("F"));
        System.out.println(cache3);
        System.out.println();
        
        System.out.println("LRU Strategy - mixed input");
        Cache cache4 = new Cache(new LRUStrategy(4));
        cache4.put(new StringKey("ab"), new PersonValue("John", 21));
        cache4.put(new StringKey("cd"), new PersonValue("Jake", 22));
        cache4.put(new StringKey("ef"), new PersonValue("Jane", 23));
        cache4.put(new StringKey("gh"), new PersonValue("Judi", 24));
        System.out.println(cache4);
        System.out.println();               
        cache4.put(new StringKey("ij"), new PersonValue("Julia", 25));
        cache4.put(new StringKey("cd"), new PersonValue("Jake", 22));
        cache4.put(new StringKey("kl"), new PersonValue("Jill", 26));
        System.out.println(cache4);
        System.out.println();
                
    }
}
