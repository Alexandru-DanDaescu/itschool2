package session15.challenges.cachesimulation;

public class Main {

    public static void main(String[] args) {

       Cache<String,CachedObject> cache = new Cache<>();

       CachedObject object1 = new CachedObject("100","some value");
       CachedObject object2 = new CachedObject("101","another value");
       CachedObject object3 = new CachedObject("100","update the value");


       cache.put(object1.getKey(),object1);
       cache.put(object2.getKey(),object2);
       cache.put(object3.getKey(),object3);

        System.out.println(cache);

    }
}
