class AreAlmostEqual{
    public static boolean areAlmostEqual(String s1, String s2) {

        if(s1.length()!=s2.length()) return false;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        for(int i=0;i<s1.length();i++){
            if(s1Array[i]!=s2Array[i]){
                int j = s2.indexOf(s1Array[i], i);
                if(j==-1) break;
                while(j<s2.length()){
                    if(s1Array[j]==s2Array[j]){
                        j++;
                        j = s2.indexOf(s1Array[i], j);
                    } else{
                        break;
                    }
                }
                if(j!=-1){
                    char temp = s2Array[j];
                    s2Array[j] = s2Array[i];
                    s2Array[i] = temp;
                    break;
                }
            }
        }
        for(int i=0;i<s1.length();i++){
            if(s1Array[i]!=s2Array[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s1 = "attack";
        String s2 = "defend";
        System.out.println(areAlmostEqual(s1, s2));
    }
}