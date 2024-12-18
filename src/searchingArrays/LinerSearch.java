package searchingArrays;

public class LinerSearch {

	public static void main(String[] args)
	{
		int nums[]= {10,5,20,60,23,19};
		int target = 20;

		int ans=linearSearch(nums,target);
		System.out.println(ans);
		
	}

	   static int linearSearch(int arr[],int target) {

		if(arr.length==0) {

		return -1;

		}

		for(int index=0;index<arr.length;index++) {
			int element=arr[index];

			if(element==target) {
				return index;
			}


		}
		return -1;
	}

}


