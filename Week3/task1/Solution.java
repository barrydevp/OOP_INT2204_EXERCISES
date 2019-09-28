
//import your library
import java.util.*;

public class Solution {
  // Type your main code here
  public static int fibonacci(int n) {
    if (n <= 0)
      return 0;
    if (n == 1)
      return 1;

    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    in.close();

    System.out.println(fibonacci(a));
  }
}