package searchingArrays;

public class LinearSearchString {

	public static void main(String[] args) {

		String[] name = {"Ashwati","Shuvankar","Lipon","Shyamlee"};
		String target ="Liponn";
		boolean ans =linearSearch(name,target);
		System.out.println(ans);
	}

	static boolean linearSearch(String[] arr,String target) 
	{
		//boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(target))
			{
				//status=true;
				//return i;
				return true;
			}
		}

		/*if(status==false)
		{
			System.out.println("Target nt found");

		}*/
		return false;


	}

}
