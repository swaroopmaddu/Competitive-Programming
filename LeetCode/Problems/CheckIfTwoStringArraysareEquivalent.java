public class CheckIfTwoStringArraysareEquivalent {
    public  static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String result1 = "";
        String result2 = "";
        for(String str : word1) result1+=str;
        for(String str : word2) result2+=str;
        return result1.equals(result2);
    }
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[] {"abc", "d", "defg"},new String[] {"abcddefg"}));
    }
}