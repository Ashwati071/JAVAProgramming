package sortingArrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] a= {4,5,1,2,3};

		for(int i=0; i<a.length-1 ; i++)
		{
			int temp=0;

			for(int j=i+1; j>0; j--)
			{
				if(a[j]<a[j-1])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
				else
				{
					break;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" "); 
		}


		
	}

}
