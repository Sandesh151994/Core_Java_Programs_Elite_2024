class TwoDimension
{

	
	public static void main(String[] args) {
		

		int arr[][]={{2,3,4},{5,6,7},{10,11,12}};

	//	int arr[]=new int[]{32,12,45,67};// One more way to declare and initialize an array

		for (int row=0;row<arr.length ;row++ ) 
		{

			for (int col=0;col<arr.length ;col++ ) {

				System.out.print(arr[row][col]+" ");
				
			}
			System.out.println();
			
		}



	}
}