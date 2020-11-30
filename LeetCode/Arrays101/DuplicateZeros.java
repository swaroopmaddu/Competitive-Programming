class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println("index "+i+" has zero");
                for(int j=arr.length-1;j>i;j--){
                    arr[j] = arr[j-1];
                }
                i++;
                if(i < arr.length){
                    arr[i] = 0;
                }
                System.out.println("index "+(i+1)+" has set to zero");
                for (int k  = 0; k < arr.length; k++) {
                    System.out.print(arr[k]+" ");
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int[] num = new int[]{0,0,0,0,0,0,0};
        duplicateZeros(num);
    }
}