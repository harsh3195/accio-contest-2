// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class NMeetings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();

        while (t-- > 0) {
            
            int n = sc.nextInt();
            int start[] = new int[n];
            int end[] = new int[n];
            for (int i = 0; i < n; i++)
                start[i] = sc.nextInt();
            for (int i = 0; i < n; i++) end[i] = sc.nextInt();;
            new Meeting().maxMeetings(start, end, n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Meeting
{
    static void maxMeetings(int start[], int end[], int n)
    {
        //your code here
    }   
}




