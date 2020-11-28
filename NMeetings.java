// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class Driverclass {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) end[i] = Integer.parseInt(inputLine[i]);
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




