import java.util.*;
public class CheckNandItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
              return true;
            }
            set.add(num);
          }
          return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(array));
    }
}
