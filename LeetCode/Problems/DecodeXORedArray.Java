class  DecodeXORedArray{
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] result = new int[++n];
        result[0] = first;
        for(int i=1;i<n;i++)
            result[i] = encoded[i-1]^result[i-1];
        return result;
    }
}