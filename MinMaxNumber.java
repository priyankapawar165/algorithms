import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class MinMaxNumber {


    public static void miniMaxSum1(List<Integer> arr) {
        long s = 0;
        long minNum = Long.MAX_VALUE;
        long maxNum = Long.MIN_VALUE;
        for (int num : arr) {
            s += num;
            minNum = Math.min(minNum, num);
            System.out.println("test min " + minNum);
            maxNum = Math.max(maxNum, num);
            System.out.println("test max " + maxNum);
        }
        System.out.println((s - maxNum) + " " + (s - minNum));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MinMaxNumber.miniMaxSum1(arr);

        bufferedReader.close();
    }
}
