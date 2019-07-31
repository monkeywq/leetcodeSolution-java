package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q152 {

	public static int maxProduct(int[]nums)
	{
		int max=nums[0],min=nums[0],res=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i]<0)
			{
				int temp=max;
				max=min;
				min=temp;
			}
			max=Math.max(nums[i], nums[i]*max);
			min=Math.min(nums[i], nums[i]*min);
			res=Math.max(max, res);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums={-2,3,4,0};
		maxProduct(nums);
	}

}
