class ReverseString{
  public static String reverse(String A){
       // brute for approch 
      // traverse strign from backword direction and add each character into new string.
      for(int i=A.length()-1;i>=0;i--){
          ans = ans + A,charAt(i);
      }
    
    // above approch is not optimised approch we need to optimise it.
    StringBuffer sb= new StringBuffer(A);
    sb.reverse();
    return sb.toString();

  }
  public static void main(String []args)
  {   String A ="sdfsdjfsdjkfbsdjkfbjdskfsdbdskf"
      System.out.println(solve(A));
  }
}
