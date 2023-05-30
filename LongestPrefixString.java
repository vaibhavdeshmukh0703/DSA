Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".



Problem Constraints
0 <= sum of length of all strings <= 1000000
  
  public class LongestCommanPrefix {
    public static String solve(ArrayList<String> al){
        String inputString = al.get(0);
        String ans ="";
        int minLength = Integer.MAX_VALUE;
        for(int j=0;j<al.size();j++){
            int lenght = al.get(j).length();
            minLength = Math.min(minLength, lenght);
        }
        System.out.println("min lenght word in string"+minLength);
        for(int i=0;i<minLength;i++){
            boolean flag =false;
            char firstCharFromString = inputString.charAt(i);
           // System.out.println("firstCharFromString "+ firstCharFromString);
            for(int j=0;j<al.size();j++){
                String eachWord = al.get(j);
                //System.out.println("each word "+eachWord);
                if(firstCharFromString != eachWord.charAt(i)){
                    flag= false;
                    break;
                }
                else{
                    flag= true;   
                }
            }
            if(flag){
                ans = ans + firstCharFromString;
                //System.out.println("Final ans "+ans);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        System.out.println(solve(al));

    }
}
