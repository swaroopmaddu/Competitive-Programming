import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int slowPointer = 0;
        int fastPointer = 0;
        int len = s.length();
        HashSet<Character> chars = new HashSet<>();
        while(fastPointer<len){
            if(chars.contains(s.charAt(fastPointer))){
                chars.remove(s.charAt(slowPointer));
                slowPointer++;
            }else{
                chars.add(s.charAt(fastPointer));
                fastPointer++;
                longest = Math.max(longest, chars.size());
            }
        }
        return longest;
    }
}