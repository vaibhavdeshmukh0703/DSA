You are given a function to_lower() which takes a character array A as an argument.

Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.
  
    Problem Constraints
1 <= |A| <= 105
  
  public class Solution {
    public ArrayList<Character> to_lower(ArrayList<Character> A) {
        for(int i=0;i<A.size();i++){
            if(A.get(i)>='A' && A.get(i)<='Z'){
                A.set(i,(char)(A.get(i)+32));
            }
        }
        return A;
    }
     public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<Character>(Arrays.asList('S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0',
                '2', '0'));
        System.out.println(to_lower(al));
    }
}
