import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
*
* @author Dari C. Castillo
*/
public class PalindromeChecker {
  static String getPalindrome(String getString){
    Queue que = new LinkedList();
    String stringP = "";

    for (int i = getString.length() - 1; i >= 0; i--) {
      que.add(getString.charAt(i));
    }

    while (!que.isEmpty()) {
      stringP = stringP + que.remove();
    }
    
    if (getString.equals(stringP)) {
      System.out.println("The string you entered is a palindrome.");
    } else {
      System.out.println("The string you entered is not a
      palindrome.\n");
    }

    System.out.print("The string you originally entered is ");
    return stringP;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String getString = sc.nextLine();
    System.out.println(getPalindrome(getString));
  }
}
