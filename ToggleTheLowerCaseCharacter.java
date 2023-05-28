Problem Description
You are given a function to_upper() consisting of a character array A.

Convert each character of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array.



Problem Constraints
1 <= |A| <= 105
  
  
  public class Solution {
    public ArrayList<Character> to_upper(ArrayList<Character> A) {
        //convert character into upper case letters
        int sizeOfString = A.size();
        for(int i=0;i<sizeOfString;i++){
            if(A.get(i)>='a' && A.get(i)<='z'){
                A.set(i,(char)(A.get(i)-32));
            }
        }
        return A;
    }
}
