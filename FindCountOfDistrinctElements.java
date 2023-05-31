Problem Description
Given an array A of N integers, return the number of unique elements in the array.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109

public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<A.size();i++){
            hs.add(A.get(i));
        }
        return hs.size();
    }
}
