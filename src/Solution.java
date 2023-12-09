// MAXIMUM JOBS DONE

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Solution {

    // Create a Pair to store start and end time together
    class Pair{
        int start;
        int end;

        Pair(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        final int N = A.size();

        if(N==1){
            return 1;
        }

        // Convert 2 given arrays into array of pairs
        ArrayList<Pair> timeIntervals = new ArrayList<Pair> ();

        for(int i=0;i<N;++i){
            timeIntervals.add(new Pair(A.get(i),B.get(i)));
        }

        // Sort pairs/timeIntervals based on end time
        Collections.sort(timeIntervals,new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2){
                return p1.end - p2.end;
            }
        });
       System.out.println(timeIntervals);


        // Select the first job and count it
        int lastJob = -1;
        int count = 0;

        for(int i=0;i<N;++i){
            // Select new job if it can be completed
            if(timeIntervals.get(i).start >= lastJob){
                ++count;
                lastJob = timeIntervals.get(i).end;
            }
        }

        return count;
    }
}