class Solution {

    public boolean checkInclusion(String s1, String s2) {

        int lenS1 = s1.length();
        int lenS2 = s2.length();
        // alphabet count
        int[] count = new int[26];
        for (int i = 0; i < lenS1; i++) {
            count[s1.charAt(i) - 97]++;
        }
         for (int i = 0; i < count.length; i++) {
            System.out.printf("%d",count[i]);
        }
        System.out.println();
        System.out.println();
        int start = 0;
        while (start < (lenS2 - start)) {
            int[] alphabet = count.clone();
            if (searchWindow(s2, alphabet, lenS1, start)) {
                return true;
            }
            start++;
        }
        return false;
    }

    public boolean searchWindow(String str, int[] alphabet, int windowSize, int start) {

        for (int i = 0; i < alphabet.length; i++) {
            System.out.printf("%d",alphabet[i]);
        }
        System.out.println();
        while (windowSize-- != 0) {
            alphabet[str.charAt(start)-97]--;
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.printf("%d",alphabet[i]);
            if (alphabet[i] != 0)
                return false;
        }
        System.out.println();

        return true;
    }
}