class SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'R') r++;
            else if(ch=='L') l++;
            if(r==l && r!=0){
                count++;
                r = 0;
                l =0;
            }
        }
        return count;
    }
}