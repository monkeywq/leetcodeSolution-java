package leetcode;

import java.util.Stack;

public class Q32 {
	
	public static int longestValidParenttheses(String s)
	{
		int length=s.length();
		int maxLength=0;
		Stack<Integer>theStack=new Stack<Integer>();
		theStack.push(-1);
		for(int i=0;i<length;i++)
		{
			char c=s.charAt(i);
			if(c=='(')
				theStack.push(i);
			else
			{
				theStack.pop();
				if(theStack.isEmpty())
					theStack.push(i);
				else
				{
					maxLength=Math.max(maxLength, i-theStack.peek());
				}
			}
		}
		return maxLength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=")(()()())";
		longestValidParenttheses(s);
	}

}
