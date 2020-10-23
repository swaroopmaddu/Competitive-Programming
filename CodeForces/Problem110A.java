/*
    https://codeforces.com/problemset/problem/110/A
*/

import java.util.Scanner;
public class Problem110A {
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    String number = in.nextLine();
	    
	    int[] Occurances = new int[10];
	    int index = 0;
	    for (int i=0;i<number.length() ;i++ ){
	        index = (int)number.charAt(i)-48;
	        Occurances[index]++;
	    }
	    
	    int luckyNumbersCount = Occurances[4] + Occurances[7];
	    
	    if(luckyNumbersCount==4 || luckyNumbersCount==7){
	        System.out.println("YES");
	    }else {
	        System.out.println("NO");
	    }
	    
	    in.close();
	}
}
