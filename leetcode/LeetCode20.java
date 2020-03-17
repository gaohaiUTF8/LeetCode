package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;



public class LeetCode20 {
	
    public static boolean isValid(String s) {
    	
    	Stack<Character> stack = new Stack<Character>();

		if(s.length() % 2 ==1 ) {
			return false;
		}

		for (int i = 0; i < s.length() ; i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
				continue;
			}
			if (!compare(stack.peek(),s.charAt(i))) {
				stack.push(s.charAt(i));
			}
			else {
				stack.pop();
			}
		}
			
    	return stack.isEmpty();
    	
    	

    }
    
    public static boolean compare(char first ,char second) {
    	if (first == '[' && second == ']') {
			return true;
		}
    	else if (first == '(' && second == ')') {
    		return true;
		}
    	else if (first == '{' && second == '}') {
			return true;
		}
    	else {
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
	}

}
