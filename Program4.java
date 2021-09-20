import java.util.*;
import java.util.HashMap;
import java.util.Map;
class Program4 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,4,64,7,8,9,10,14,18,32};
		int[] n = {1,2,3,4,5,6,7,8,9};
		int count=0;
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i=0;i<n.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				
				hm.put(n[i],count);
				if (n[i] % arr[j] == 0)
				{
					count = count+1;
					
				}
				j++;
			}
			
		}
		
	
		hm.forEach((key,value) -> System.out.print(key + ":" + value+" "));
	}
}
