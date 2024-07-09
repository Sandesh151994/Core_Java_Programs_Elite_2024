import java.util.Scanner;
class BinarySearch
{
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("ENter the size of an array");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.print("Enter the elements of an array ");

		for (int i=0;i<arr.length ;i++ ) {

			System.out.println("For index "+i);

			arr[i]=sc.nextInt();
			
		}

		int low=0,high=arr.length-1;

		System.out.println("Enter the key value");
		int key= sc.nextInt();
		

		while(low<=high)
		{
			
			int mid=(low+high)/2;

			if(arr[mid]<key)
			{
				low=low+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println(key +" found at : "+mid);
				break;
			}
			else
			{
				high=high-1;
			}

		}

		if(low>high)
		{

		System.out.println(key+" Not Found");	
	}
		}
}