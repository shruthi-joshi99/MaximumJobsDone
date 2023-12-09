import java.util.ArrayList;
import java.lang.System;

//There are N jobs to be done, but you can do only one job at a time.
//Given an array A denoting the start time of the jobs and an array B denoting the finish time of the jobs.
//Your aim is to select jobs in such a way so that you can finish the maximum number of jobs.
//Return the maximum number of jobs you can finish.

public class Client {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<Integer>() {
            {
                add(1);
                add(5);
                add(7);
                add(1);
            }
        };
        ArrayList<Integer> B = new ArrayList<Integer>() {
            {
                add(7);
                add(8);
                add(8);
                add(8);
            }
        };

        Solution solution = new Solution();
        int maximumJobsDone = solution.solve(A, B);
        System.out.println(maximumJobsDone);

    }
}
