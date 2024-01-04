import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    // Write your code here

    static void staircase(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<n-1-j)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }


    }
}
public class StairCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result1.staircase(n);

        bufferedReader.close();
    }
}
