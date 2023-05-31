Problem Description
Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109
  
  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindFirstRepeatElement {
    public static int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (!(hm.containsKey(A.get(i)))) {
                hm.put(A.get(i), 1);
            } else {
                int count = hm.get(A.get(i));
                hm.put(A.get(i), count+=1);
            }
        }
        System.out.println(hm);
        for (int j = 0; j < A.size(); j++) {
            if (hm.get(A.get(j)) >= 2) {
                return A.get(j);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10, 5, 3, 4, 3, 5, 6));
        System.out.println(solve(al));
    }
}
