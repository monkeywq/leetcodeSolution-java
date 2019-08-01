package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q20 {

	public static boolean isValid(String s)
	{
		Stack<Character> kuohu=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='('||c=='['||c=='{')
				kuohu.push(c);
			else{
				switch(c){
					case(')'):
						if(kuohu.lastElement()=='(')
							kuohu.pop();
						else
							kuohu.push(c);
						break;
					case(']'):
						if(kuohu.lastElement()=='[')
							kuohu.pop();
						else
							kuohu.push(c);
						break;
					case('}'):
						if(kuohu.lastElement()=='{')
							kuohu.pop();
						else
							kuohu.push(c);
						break;
					default:
							break;
				}
			}
		}
		boolean res=kuohu.isEmpty();
		return res;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="([])";
		isValid(s);
	}

}
