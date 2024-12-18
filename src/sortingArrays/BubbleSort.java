package sortingArrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = {36,19,29,12,5};   //5,12,19,29,36
		int temp;

		for(int i=0;i<arr.length;i++)   // this for loop is to calculate no. of rounds
		{
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++) //length-1 = because we will b comparing adjacent value with +1 and -i= the highest num will b at the end 
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;    //flag will be 1 until the swapping is happening.
				}

			}
			if(flag==0)
			{
				break;     // flag=0 means array is already sorted and swapping is not happening.i don need to perform ny no of rounds.
				           // i ll break the loop.
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
