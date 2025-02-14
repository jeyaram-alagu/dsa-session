import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        
        //insertion
        map.put("JD","John Durairaj");
        map.put("GOAT","Gandhi");
        map.put("P","Parthiban");
        System.out.println(map.get("JD"));
        System.out.println(map.get("P"));
        System.out.println(map.getOrDefault("LEO","not found"));
        
          System.out.println(map.keySet());
          System.out.println(map.values());
        map.remove("P");
        map.remove("GOAT");
        for(String key:map.keySet())
            {
                System.out.println(key +""+map.get(key));
            }
        System.out.println(map.containsKey("LEO"));
            System.out.println(map.containsValue("John Durairaj"));
            
