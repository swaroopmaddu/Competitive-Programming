package Arrays101;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * @author Sai
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1=m-1;
        int num2=n-1;
        for (int i = m+n-1;i>=0; i--) {
            int a = num1>=0 ? nums1[num1] : Integer.MIN_VALUE;
            int b = num2>=0 ? nums2[num2]: Integer.MIN_VALUE;
            if(a>b){
                nums1[i] = a;
                num1--;
            } else {
                nums1[i] = b;
                num2--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m=3, n=3;
        merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
}
