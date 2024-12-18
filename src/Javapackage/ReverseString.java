package Javapackage;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Ashwati";
		String res="";
		int k = name.length();
		 
		for(int i=k-1; i>=0; i-- ) {
			
			res=res+name.charAt(i);
			
		}
		System.out.println(res);

	}

}
