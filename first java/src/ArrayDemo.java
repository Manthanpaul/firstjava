
public class ArrayDemo {

	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50};
		int arr2[] = new int[5];
		int arr3[] = new int[]{10,20,30,40,50};
		
		for(int i=0;i<5;i++)
			System.out.println(arr[i]);
		for(int z:arr)
			System.out.println(z);
			String s = "Hello";
			System.out.println(s.length());
			System.out.println(arr.length);
	}

}
