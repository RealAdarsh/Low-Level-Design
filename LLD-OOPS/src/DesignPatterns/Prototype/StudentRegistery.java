package DesignPatterns.Prototype;
import java.util.Map;
import java.util.HashMap;

public class StudentRegistery {
    private Map <String, Student> map=new HashMap<>();

    void register(String key, Student student){
        map.put(key,student);
    }

    Student get(String key){
        return map.get(key);
    }
}
