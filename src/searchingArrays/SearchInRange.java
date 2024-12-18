package searchingArrays;

public class SearchInRange {

	public static void main(String[] args) {
		
		int nums[]= {10,5,20,60,23,19};
		int target = 10;
		int ans =linearSearch(nums,target, 1, 4); //here 1 and 4 are the range

	}
	
	static int linearSearch(int[] arr,int target,int start, int end) {
		int temp=0;
		//boolean status=false;
		for(int i=start; i<=end;i++) 
		{
			int element=arr[i];
			if(element==target)
			{
				temp=temp+1;
				return i;
				//return true;
			}
		}
	    if(temp==0)
			//if(status==false)
         
		{
           System.out.println("Item not found in the list");
		}
		return -1;

	}

}
