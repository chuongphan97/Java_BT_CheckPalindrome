import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sArr = s.split(" ");

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < sArr.length; i++) {
            stack.push(sArr[i]);
            queue.add(sArr[i]);
        }
        boolean result = true;
        while (!stack.isEmpty()){
            if (!stack.pop().toLowerCase(Locale.ROOT).equals(reverserString(queue.remove().toLowerCase(Locale.ROOT)))) {
                result = false;
                break;
            }
        }
        if (result) System.out.println("This String is Palindrome");
        else System.out.println("This String is not Palindrome");

    }
    
    public static String reverserString(String s){
        String[] sArr = s.split("");
        for (int i = 0; i < sArr.length / 2; i++) {
            String temp = sArr[i];
            sArr[i] = sArr[sArr.length-1-i];
            sArr[sArr.length-1-i] = temp;
        }
        String result="";
        for (int i = 0; i < sArr.length; i++) {
            result += (sArr[i]);
        }
        return result;
    }
}
