package session15_equalsAndHashcodeAndGenerics.challenges.cachesimulation;

import java.util.HashMap;
import java.util.Map;

public class Cache <K,V>{
    private Map<K,V> cacheMap;

    public Cache(){
        cacheMap = new HashMap<>();
    }

    public void put(K key, V value){
        cacheMap.put(key,value);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(K key : cacheMap.keySet()){
            stringBuilder.append(key).append(" ").append(cacheMap.get(key));
        }
        return stringBuilder.toString();
    }
}
