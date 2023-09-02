package TechSaksham;



import java.util.*;

public class twosum {
	public static List<int[]> twoSum(int[] arr,int Tarsum)
	{
		List<int[]> pairs=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
        	int diff=Tarsum-arr[i];
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[j]==diff)
        		{
        			int[] pair= {arr[i],arr[j]};
        			pairs.add(pair);
        		}
        	}
        }
        return pairs;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		int Tarsum=6;
		List<int[]> res=twoSum(arr,Tarsum);
		if(res.isEmpty())
		{
			System.out.println("no pairs found");
		}
		else
		{
			for(int[] pair: res)
			{
				System.out.println(Arrays.toString(pair));
			}
		}
	}
	

}
