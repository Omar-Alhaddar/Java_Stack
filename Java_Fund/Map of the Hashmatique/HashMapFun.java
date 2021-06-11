import java.util.*;


public class HashMapFun{

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Fredo Bang", "Mama, I'm a stepper, I can't walk by fate");
        trackList.put("Lil Tjay", "Steady callin' my phone");
        trackList.put("Tion Wayne", "E-E-English girl named Fiona");
        trackList.put("YNW Melly", "Your love is suicidal");

        String lyrics =trackList.get("Fredo Bang");
        System.out.println("this is the lyrics of Fredo Bang: " + lyrics);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
     
        }

        
    }
}