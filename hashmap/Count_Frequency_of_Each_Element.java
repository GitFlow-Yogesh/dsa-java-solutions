//just learnt how to store and access = very nice and easy concept

import java.util.HashMap;
import java.util.Map;
class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        Map<Integer,Integer> maps= new HashMap<>();
        for(int num : arr){
            maps.put(num,maps.getOrDefault(num,0)+1);
        }
        for(int key : maps.keySet()){
            System.out.println(key+" present "+ maps.get(key));
        }
    }
}
