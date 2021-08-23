package Day2;

import java.io.*;

import static java.util.stream.Collectors.joining;

public class Operators {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here

        Double porcentaje = Double.valueOf(100);
        double meal_cost2 = 0;
        double tip_percent2 = 0;
        double tax_percent2 = 0;

        tip_percent2 =(meal_cost /porcentaje) * tip_percent;

        tax_percent2 =(tax_percent/porcentaje) * tip_percent;

        meal_cost2 =(meal_cost+tip_percent2+tax_percent2);

        System.out.println(Math.round(meal_cost2));

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Operators.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
