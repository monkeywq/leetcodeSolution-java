package leetcode;

import java.util.*;

public class Q187 {
	public static List<String> findRepeatedDnaSequences(String s)
	{
		List<String>lists=new ArrayList<String>();
		Set<String>sets=new HashSet<String>();
		Set<String>set2=new HashSet<String>();
		for(int i=0;i+10<=s.length();i++)
		{
			String subStr=s.substring(i,i+10);
			if(set2.contains(subStr))
				sets.add(subStr);
			set2.add(subStr);
		}
		lists.addAll(sets);
		return lists;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AAAAAAAAAAA";
		findRepeatedDnaSequences(s);
	}

}
