import java.util.*;

class Searching
{

	public static void main(String[] args) {
		
		int arr[]={20,34,40,50,40,70,10};
		Scanner sc= new Scanner(System.in);



		System.out.println("Enter key to search");
		int key=sc.nextInt();

		boolean flag=false;

		
		int i;
		for (i=0;i<arr.length ; i++) {

			if(key==arr[i])
			{
				flag=true;
				System.out.println(key+" found at "+i);
					
				
			}
			
		}
			
		if(flag==false)
		{
			System.out.println(key+" Not FOund");
		}


	}
}