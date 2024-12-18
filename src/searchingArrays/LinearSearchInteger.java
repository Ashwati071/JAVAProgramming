package searchingArrays;

public class LinearSearchInteger {

	public static void main(String[] args) {

		int nums[]= {10,5,20,60,23,19};
		int target = 23;
		LinearSearchInteger obj = new LinearSearchInteger();
		int ans =obj.linearSearch(nums,target);
		System.out.println(ans);

	}

	 int linearSearch(int[] arr,int target) {
		int temp=0;
		//boolean status=false;
		for(int i=0; i<arr.length;i++) 
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


