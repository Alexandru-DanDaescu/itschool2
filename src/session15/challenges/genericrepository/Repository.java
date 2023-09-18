package session15.challenges.genericrepository;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class Repository<T>{

    private Map<Integer, T> repositoryData;

    public Repository(){
        repositoryData = new HashMap<>();
    }

    public void put(Integer key, T object){
        repositoryData.put(key,object);
    }

    public T get(Integer key){
        return repositoryData.get(key);
    }

    public void remove(Integer key){
        repositoryData.remove(key);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Repository<?> repository = (Repository<?>) obj;

        return Objects.equals(repositoryData,repository.repositoryData);
    }

    @Override
    public int hashCode(){
        return Objects.hash(repositoryData);
    }


}
