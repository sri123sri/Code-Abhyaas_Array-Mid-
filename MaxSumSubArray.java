package TechSaksham;

public class MaxSumSubArray {
	public static int MaxSum(int[] arr)
	{
		int max_sum=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(sum<0)
			{
				sum=0;
			}
			else if(sum>max_sum)
			{
				max_sum=sum;
			}
		}
		return max_sum;
	}
	public static void main(String[] args)
	{
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println((MaxSum(arr)));
	}

}
