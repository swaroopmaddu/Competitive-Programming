public class ReplaceElementswithGreatestElementonRightSide {
    public  static int[] replaceElements(int[] arr) {
        int maxVal = -1;
        int maxIndex = -1;
        for(int i=0; i< arr.length; i++){
            if(i < maxIndex){
                arr[i] = maxVal;
            } else {
                maxVal = -1;
                for(int j = i+1;j<arr.length;j++){
                    if(arr[j] > maxVal){
                        maxVal = arr[j];
                        maxIndex = j;
                    }
                }
                arr[i] = maxVal;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = new int[]{17,18,5,4,6,1};
        array = replaceElements(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
