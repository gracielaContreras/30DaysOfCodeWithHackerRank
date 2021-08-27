package Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        List word = new ArrayList();

        scan.nextLine();
        for (int i = 1; i <= number; i ++) {

            String text = scan.nextLine();
            word.add(text);

        }
        scan.close();
        for (int j = 0; j < word.size(); j ++){
            String vocal = (String) word.get(j);
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            StringBuilder join = new StringBuilder();

            for (int k = 0; k < vocal.length(); k ++){
                if(k %2 ==0) {
                    even.append(vocal.charAt(k));

                }else {
                    odd.append(vocal.charAt(k));
                }
            }
            System.out.println(join.append(even).append(" ").append(odd));

        }

    }
}
