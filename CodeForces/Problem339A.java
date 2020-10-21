/*
    https://codeforces.com/problemset/problem/339/A
*/
import java.util.Scanner;
import java.util.Arrays; 

public class Problem339A {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	String equation = in.next();
    	
    	if(equation.length()<2){
    	    System.out.println(equation);
    	    return;
    	}
    	
    	equation = equation.replace("+","");
        char tempArray[] = equation.toCharArray(); 
          
        Arrays.sort(tempArray); 
    	
    	int i = 0;
    	for ( i=0;i<equation.length()-1;i++ ){
    	    System.out.print(String.valueOf(tempArray[i])+'+');
    	}
    	System.out.println(tempArray[i]);
    	
    	in.close();
	}
}
