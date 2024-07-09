class IfElseIf
{
	
	public static void main(String[] args) {
		
		float percentage=70.56f;

		if(percentage>75)
		{
			System.out.println("ELigible for joining RV");
		}

		else if(percentage>=70)
		{
			System.out.print("Eligible for joining Don Bosco");
		}

		else if (percentage>60) {
			System.out.println("Eligible for Joining Alvas");			
		}
	}
}