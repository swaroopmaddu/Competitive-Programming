class Solution {
    public String reverseWords(String s) {
        String result = "";
        int len = s.length();
        int i = 0;
        int j = 0;
        int stop = 0;
        while(j<len){
            if(s.charAt(j)==' '){
                stop = j-1;
                while(stop>=i){
                    result+=s.charAt(stop--);
                }
                i = j+1;
                result+=" ";
            }
            j++;
        }
        j--;
        while(j>=i){
                result+=s.charAt(j--);
        }
        return result;
    }
}