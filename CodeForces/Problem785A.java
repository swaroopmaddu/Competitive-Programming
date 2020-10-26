/*
    https://codeforces.com/problemset/problem/785/A
*/
import java.util.Scanner;
public class Problem785A {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    
	    int total=0;
	    while(num--!=0){
	        String poly = in.next();
	        
	        if(poly.equals("Tetrahedron")){
	            total+=4;
	        } else if(poly.equals("Cube")){
	            total+=6;
	        } else if(poly.equals("Octahedron")){
	            total+=8;
	        } else if(poly.equals("Dodecahedron")){
	            total+=12;
	        } else if(poly.equals("Icosahedron")){
	            total+=20;
	        }
	    }
	    System.out.println(total);
	    in.close();
	}
}
