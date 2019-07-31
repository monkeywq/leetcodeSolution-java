package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q151 {
	public static String reverseWords(String s)
	{
		if(s.isEmpty())
			return s;
		String reverseS="";
		String [] subStr=s.split(" ");
		List<String>subStrL=new ArrayList<String>();
		if(subStr.length==0)
			return s;
		int length=subStr.length;
		for(int i=0;i<length;i++)
		{
			if(!subStr[i].isEmpty())
				subStrL.add(subStr[i]);
		}
		length=subStrL.size();
		for(int i=length-1;i>0;i--)
		{
			reverseS+=subStrL.get(i)+" ";
		}
		reverseS+=subStrL.get(0);
		return reverseS;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		reverseWords(s);
	}

}
