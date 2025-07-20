import java.util.Scanner;
import java.util.*;
public class palindrome {
    /**
     * The main method reads a string from the user and checks if it is a palindrome.
     * It prints "palindrome" if the input string is a palindrome, otherwise prints "not palindrome".
     * 
     * The current implementation uses a for loop to compare characters from the start and end of the string.
     * 
     * Alternative approach (using a while loop with two pointers):
     * // int start = 0, end = str.length() - 1;
     * // boolean isPalindrome = true;
     * // while (start < end) {
     * //     if (str.charAt(start) != str.charAt(end)) {
     * //         isPalindrome = false;
     * //         break;
     * //     }
     * //     start++;
     * //     end--;
     * // }
     */
    public static void main(String[] args) {
        System.out.println("enter a string:");
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
         int n=str.length();
         boolean ispalindrome = true;
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
              ispalindrome=false;
              break;
            }
        }
        if(ispalindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
