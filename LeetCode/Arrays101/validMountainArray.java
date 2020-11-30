public class validMountainArray {
    public static boolean IsvalidMountainArray(int[] A) {
        if(A.length < 3 || A[0]>A[1]) 
            return false;

        boolean inc = false;
        boolean dec = false;
        int i;
        for (i = 0; i < A.length-1; i++) {
            if(A[i]<A[i+1]){
                inc = true;
            } else {
                break;
            }
        }
        for (int j = i; j < A.length-1; j++) {
            if(A[j]>A[j+1]){
                dec = true;
            } else {
                return false;
            }
        }
        
        return inc && dec;
    }
    public static void main(String[] args) {
        int[] array = new int[]{3,45,55};
        System.out.println(IsvalidMountainArray(array));
        array = new int[]{0,3,2,1};
        System.out.println(IsvalidMountainArray(array));
        array = new int[]{3,5,5};
        System.out.println(IsvalidMountainArray(array));
    }
}
