import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int i1, s1, s2;
        i1 = s1 = s2 = 0;
        int i2 = 0;
        for (List<Integer> l : arr) {
            int i3 = arr.size() - 1 + i2;
            s1 += l.get(i1);
            i1 += 1;
            s2 += l.get(i3);
            i2 -= 1;
        }
        return Math.abs(s1 - s2);
   }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {

                arr.add(
                        Stream.of(
                                bufferedReader
                                        .readLine()
                                        .replaceAll("\\s+$", "").
                                        split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = DiagonalDifference.diagonalDifference(arr);
        System.out.println(result);
     //   bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();
        bufferedReader.close();
      //  bufferedWriter.close();
    }
}
