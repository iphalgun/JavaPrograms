import java.util.HashMap;

public class Hashmap1{
    
    public static void main(String args[])
    {
        HashMap<String, Integer> mp= new HashMap<>();
        mp.put("Supriya",18);
        mp.put("Saurabh",23);
        mp.put("Vaibhav",17);

        System.out.println(mp.get("Supriya"));

        System.out.println(mp.containsKey("Supriya"));
        System.out.println(mp.containsValue(18));
    }
}