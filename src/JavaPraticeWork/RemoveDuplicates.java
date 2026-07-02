package JavaPraticeWork;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
      //  int[] x = set.stream().mapToInt(Integer::intValue).toArray();
     //   System.out.println(Arrays.toString(x)); // [1, 2, 3, 4, 5]
        System.out.println(set);
    }
}