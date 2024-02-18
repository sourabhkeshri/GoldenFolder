package dsa;
import java.util.ArrayList;
import java.util.List;

public class SubarrayGenerator {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        List<List<Integer>> subarrays = generateSubarrays(array);

        subarrays.forEach(System.out::println);
    }

    public static List<List<Integer>> generateSubarrays(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        int n = array.length;

        int totalSubarrays = (1 << n) - 1;

        for (int i = 1; i <= totalSubarrays; i++) {
            List<Integer> currentSubarray = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    currentSubarray.add(array[j]);
                }
            }
            result.add(currentSubarray);
        }

        return result;
    }
}
