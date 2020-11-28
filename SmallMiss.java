import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0) {
	        int n = sc.nextInt();
	        n++;
	        int array[] = new int[n];
	        
	        for (int i = 0; i < n-1; i++) {
	            int d = sc.nextInt();
	            if(d > 0 && d <= n) {
	                 array[d - 1] = -1;
	            }
	        }
	        
	        for (int i =0; i < n;i++) {
	            if (array[i] == 0) {
	                System.out.println(i+1);
	                break;
	            }
	        }
	    }
	 }
}