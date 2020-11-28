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
        int c=-1;
        Pair[] act = new Pair[n];
        for(int i=0;i<n;i++)
            act[i] = new Pair(start[i],end[i],i+1);
        Arrays.sort(act,new com());
        for(int i=0;i<n;i++)
            if(act[i].x>c)
            {
                c=act[i].y;
                System.out.print(act[i].z+" ");
            }
    }   
}
class Pair
{
    int x,y,z;
    Pair(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
    }
}
class com implements Comparator<Pair>
{
    public int compare(Pair a,Pair b)
    {
        return a.y-b.y;
    }
}




