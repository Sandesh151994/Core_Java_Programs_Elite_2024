class NestedIf
{
	
	public static void main(String[] args) {
		
		String nationality="Indian";

		String state="MP";

		boolean voting_card=false;

		if(nationality=="Indian")// Outer 1
		{
			System.out.println("Welcome to India");
			if(state=="MP")//
			{
				System.out.println("Welcome to MadhyaPradesh");
				if(voting_card==true)
				{
					System.out.println("Eligible for voting in MP");
				}
			}
		}
	}
}