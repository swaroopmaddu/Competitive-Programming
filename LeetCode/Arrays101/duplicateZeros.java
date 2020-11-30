package Arrays101;

/**
 *
 * @author Sai
 */
public class duplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=arr.length-1;j>i;j--){
                    arr[j] = arr[j-1];
                }
                i++;
                if(i < arr.length){
                    arr[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,1,0,0,2,3,0,4,5,6};
        duplicateZeros(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}


