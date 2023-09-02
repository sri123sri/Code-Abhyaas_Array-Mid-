package TechSaksham;
import java.util.*;
public class FourSum {
      public static List<int[]> foursum(int[] arr,int TarSum)
      {
    	  List<int[]> pairs=new ArrayList<>();
    	  int n=arr.length;
    	  if(arr==null || arr.length<4)
    	  {
    		  return pairs;
    	  }
    	  Arrays.sort(arr);
    	  for(int i=0;i<n-3;i++)
    	  {
    		  if(i>0 && arr[i]==arr[i-1])
    		  {
    			  continue;
    		  }
    		  for(int j=i+1;j<n-2;j++)
    		  {
    			  if(j>i+1 && arr[j]==arr[j-1])
    			  {
    				  continue;
    			  }
    			  int left=j+1;
    			  int right=n-1;
    			  while(left<right)
    			  {
    				  int sum=arr[i]+arr[j]+arr[left]+arr[right];
    				  if(sum==TarSum)
    				  {
    					  int[] pair= {arr[i],arr[j],arr[left],arr[right]};
    					  pairs.add(pair);
    					  while(left<right && arr[left]==arr[left+1])
    					  {
    						  left++;
    					  }
    					  while(left<right && arr[right]==arr[right+1])
    					  {
    						  right--;
    					  }
    					  left++;
    					  right--;
    				  }
    				  else if(sum<TarSum)
    				  {
    					  left++;
    				  }
    				  else
    				  {
    					  right--;
    				  }
    			  }
    		  }
    	  }
    	  return pairs;
      }
      public static void main(String[] args)
      {
    	  int[] arr= {1,2,3,4,5,6,7,8,1,2,3,4};
    	  int TarSum=10;
    	  List<int[]> res=foursum(arr,TarSum);
    	  if(res.isEmpty())
    	  {
    		  System.out.println("no pairs found");
    	  }
    	  else
    	  {
    		  for(int[] num:res)
    		  {
    			  System.out.println(Arrays.toString(num));
    		  }
    	  }
      }
}
