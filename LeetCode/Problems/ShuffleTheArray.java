public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int index = 0;
        int i = 0;
        while (index < 2*n){
            result[index] = nums[i];
            result[index + 1] = nums[i + n];
            index+=2;            
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] result = shuffle(new int[]{2,5,1,3,4,7},3);
        System.out.println("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
