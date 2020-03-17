package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode22 {
	
	public static List<String> generateParenthesis(int n) {
		LinkedList<LinkedList<String>> result = new LinkedList<LinkedList<String>>();
		if (n == 0)
			return result.get(0);
		//0组括号时记为None
		LinkedList<String> list0 = new LinkedList<String>();
		list0.add("");
		result.add(list0);
		
		//1组括号只有一种情况
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("()");
		result.add(list1);
		
		
		for (int i = 2; i <= n; i++) {
			LinkedList<String> temp = new LinkedList<String>();
			for (int j = 0; j < i; j++) {
				List<String> str1 = result.get(j);
				List<String> str2 = result.get(i - 1 - j);
				for (String s1 : str1) {
					for (String s2 : str2) {
						String el = "(" + s1 + ")" + s2;
						temp.add(el);
					}
				}

			}
			result.add(temp);
		}
		return result.get(n);
	}
	
	public static void main(String[] args) {
		List<String> list = generateParenthesis(4);
		for(String string : list) {
			System.out.println(string);
		}
	}

}
