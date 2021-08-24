package Day3;

import java.io.*;

public class IntrotoConditionalStatements {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());

            if((N % 2 == 0) && (N > 2 && N < 5 || N > 21)) {

                System.out.println("Not Weird");

            }else {

                System.out.println("Weird");
            }
            bufferedReader.close();
        }
}
