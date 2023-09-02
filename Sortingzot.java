package TechSaksham;

import java.util.Arrays;

public class Sortingzot {
	public static void Sorting(int[] arr)
	{
		int zero_p=0;
		int two_p=arr.length-1;
		int i=0;
		while(i<=two_p)
		{
			if(arr[i]==0)
			{
				int temp=arr[i];
				arr[i]=arr[zero_p];
				arr[zero_p]=temp;
				i++;
				zero_p++;
			}
			else if(arr[i]==2)
			{
				int temp=arr[i];
				arr[i]=arr[two_p];
				arr[two_p]=temp;
				two_p--;
			}
			else
			{
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,0,0,2,1};
		Sorting(arr);
	}

}
