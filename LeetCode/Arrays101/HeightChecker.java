import java.util.Arrays;
public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] right_pos = heights.clone();
        Arrays.sort(right_pos);
        
        int wrong = 0;
        for(int i=0;i< heights.length;i++){
            if(heights[i] != right_pos[i] ){
                wrong++;
            }
        }
        return wrong;        
        
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,1,4,2,1,3};
        System.out.println(heightChecker(array));
        array = new int[]{5,1,2,3,4};
        System.out.println(heightChecker(array));
        array = new int[]{1,2,3,4,5};
        System.out.println(heightChecker(array));
    }
}
