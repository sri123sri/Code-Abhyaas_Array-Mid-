package TechSaksham;
import java.util.*;
public class threeSum {
	public static List<int[]> ThreeSum(int[] arr,int TarSum)
	{
		List<int[]> pairs=new ArrayList<>();
		int n=arr.length;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==TarSum)
					{
						int[] pair= {arr[i],arr[j],arr[k]};
						pairs.add(pair);
					}
				}
			}
		}
		return pairs;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		int TarSum=6;
		List<int[]> res=ThreeSum(arr,TarSum);
		if(res.isEmpty())
		{
			System.out.println("no pairs found");
		}
		else
		{
			for(int[] pair:res)
			{
				System.out.println(Arrays.toString(pair));
			}
		}
	}

}
