package strategy;

public class Main {

    public static void main(String[] args) {
        Cache cache1 = new Cache(new FifoStrategy(3));
        cache1.put(new IntKey(1), new IntValue(100));
        cache1.put(new IntKey(2), new IntValue(200));
        cache1.put(new IntKey(3), new IntValue(300));
        System.out.println(cache1);
        System.out.println();
        cache1.put(new IntKey(4), new IntValue(400));
        cache1.put(new IntKey(5), new IntValue(500));
        System.out.println(cache1);
        System.out.println();

        Cache cache2 = new Cache(new FifoStrategy(2));
        cache2.put(new StringKey("skdfj"), new PersonValue("John", 24));
        System.out.println(cache2);
        System.out.println();
        cache2.put(new StringKey("DFD"), new PersonValue("Kate", 100));
        cache2.put(new StringKey("CFqd"), new PersonValue("Alice", 22));
        System.out.println(cache2);
        System.out.println();
    }
}
