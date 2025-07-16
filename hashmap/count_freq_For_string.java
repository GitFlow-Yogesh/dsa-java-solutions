//same like array ntg new
import java.util.LinkedHashMap;//u should know why used this instead of hashmap only=just one word diff 
import java.util.HashMap;
import java.util.Map;
class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        String word = "programming";
        Map<Character,Integer> maps= new LinkedHashMap<>();
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            maps.put(ch,maps.getOrDefault(ch,0)+1);
        }
        for(char key : maps.keySet()){
            System.out.println(key +" is present "+maps.get(key));
        }
    }
}
