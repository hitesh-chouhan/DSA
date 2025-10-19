package Hashing;

import java.util.*;
import java.util.HashMap;

public class Mapping {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        String a = "Hitesh";
        String r;
        map.put("H", 23);
        map.put("Arpita",21);
        map.put("Bg",21);

        map.containsKey(a.charAt(0));
        System.out.println(map);
        System.out.println(map.get("Hitesh"));
        System.out.println(map.remove("Arpita"));

        //to iterate on a map, we use for loop
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }
    }
    static String removeVowels(String i){
        return i.replaceAll("[aeiouAEIOU]","*");
    }
}
