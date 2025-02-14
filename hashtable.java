import java.util.*;
public class Main {
    public static void main(String[] args) {
        Hashtable<String,String>table=new Hashtable<>();
        
        //insertion
        table.put("JD","John Durairaj");
        table.put("GOAT","Gandhi");
        table.put("P","Parthiban");
        for(String key:table.keySet())
            {
                System.out.println(key +""+table.get(key));
        }
        HashSet<Integer>set = new HashSet<>();
        
        set.add(2);set.add(4);set.add(4);set.add(5);set.add(6);
        for(Integer i:set){
            System.out.println(i);
        

        
        
