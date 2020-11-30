public class FindNumberswithEvenNumberofDigits {
    
    public static int findNumbers(int[] nums) {
        int result =0;

        for(int num : nums){
            double digits = Math.log10(num);
            if((Math.floor(digits)+1)%2==0)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = new int[]{100000}; 
        System.out.println(findNumbers(num));
    }
}
