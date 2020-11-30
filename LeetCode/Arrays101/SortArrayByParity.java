class SortArrayByParity{
    public static int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length-1;

        while (i < j){
            System.out.println("Array at i is"+A[i]+" Array at j is "+A[j]);
            int temp;
            if(A[i]%2==0 && A[j]%2==1){
                i++;
                j--;
            } else if(A[i]%2==0 && A[j]%2==0){
                i++;
                continue;
            } else if(A[i]%2==1 && A[j]%2==0){
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            } else{
                j--;
            }
        }

        return A;
    }
    public static void main(String[] args) {
        int[] array = new int[]{3,1};
        array = sortArrayByParity(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}