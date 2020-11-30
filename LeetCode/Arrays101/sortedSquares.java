package Arrays101;
import java.util.Arrays;

/**
 *
 * @author Sai
 */
public class sortedSquares {
    public static int[] sortedSquares(int[] A) {
        int SquaresArray[] = new int[A.length];
        
        for(int i=0;i<A.length;i++){
            SquaresArray[i] = A[i] * A[i];
        }

        Arrays.sort(SquaresArray);
        return SquaresArray;
    }
    public static void main(String[] args) {
         int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
         array = sortedSquares(array);
         for(int i=0;i<array.length;i++){
             System.out.println(array[i]+" ");
        }
    }
}
