Given an array A. You have some integers given in the array B.
For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.


Problem Constraints
1 <= |A| <= 105
1 <= |B| <= 105
1 <= A[i] <= 105
1 <= B[i] <= 105
  
  import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindFreqForQuery {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (!(hm.containsKey(A.get(i)))) {
                hm.put(A.get(i), 1);
            } else {
                int count = hm.get(A.get(i));
                hm.put(A.get(i), count += 1);
            }
        }

        System.out.println(hm);
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int j = 0; j < B.size(); j++) {
            if (hm.get(B.get(j)) == null) {
                al.add(0);
            } else {
                al.add(hm.get(B.get(j)));
            }
        }
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2, 5, 9, 2, 8));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(3, 2));
        System.out.println(solve(A, B));
    }
}
