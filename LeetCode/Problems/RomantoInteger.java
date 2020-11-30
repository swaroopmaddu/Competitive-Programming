import java.util.HashMap;

/**
 *
 * @author Sai
 */
public class RomantoInteger {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> romans = new HashMap();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);
        
        int result = 0;
        int length = s.length();
        if(length<2)
            return romans.get(s.charAt(0));
        
        int i = 0;
        for (i = 0; i < length-1; i++) {
             int current = romans.get(s.charAt(i));
             
             if(current < romans.get(s.charAt(i+1))){
                 result -= current;
             }
             else {
                 result += current;
             }
        }
        result += romans.get(s.charAt(i));
        return result;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("XII"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
