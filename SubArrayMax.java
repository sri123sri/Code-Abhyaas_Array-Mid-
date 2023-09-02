package TechSaksham;
import java.util.*;
public class SubArrayMax {
	public static void SubArray(int[] arr)
	{
		int max_sum=0;
		int sum=0;
		int start=-1;
		int curr_start=-1;
		int end=-1;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(sum<=0)
			{
				sum=0;
				start=i+1;
			}
			else if(sum>max_sum)
			{
				max_sum=sum;
				curr_start=start;
				end=i;
			}
		}
		System.out.println(max_sum);
		for(int i=curr_start;i<=end;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr={-2,1,-3,4,-1,2,1,-5,4};
		SubArray(arr);
	}

}
