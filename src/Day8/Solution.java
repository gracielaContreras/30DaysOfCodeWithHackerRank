package Day8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }
        // Write code here
        Map<String,String> map2 = new LinkedHashMap<>();
        in.next();
        for(int i = 0; i < n; i++){
            String s = in.next();
            map2.put("nombre",s);
        }
/*        for (Map.Entry<String, Integer> map1 : map.entrySet()) {
            if (map2.get(1).equalsIgnoreCase(map1.getKey())) {
                System.out.println(map1);
            } else {
                System.out.println("Not found");
            }
            break;
        }*/

        in.close();
    }

}
