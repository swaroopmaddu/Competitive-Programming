import java.util.Arrays;

class SquaresofaSortedArray{
    public static int[] sortedSquares(int[] A) {
        int SquaresArray[] = new int[A.length];
        
        for(int i=0;i<A.length;i++){
            SquaresArray[i] = A[i] * A[i];
        }

        Arrays.sort(SquaresArray);
        return SquaresArray;
        
    }


    public static void main(String[] args) {
        int[] num = new int[]{-4,-1,0,3,10}; 
        int[] result = sortedSquares(num);

        for(int n : result){
            System.out.print(n+" ");
        }
    }
}