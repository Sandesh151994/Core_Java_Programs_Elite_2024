class Typecasting
{


	public static void main(String[] args) {
		
		byte n1=127;

		int n2=n1;

		System.out.println(n1);

		// Implicit Typecasting

		System.out.println("Byte to Int : "+n2);

		// Explicit Typecasting

		int n3=29379999;

		short n4=(short) n3;
		System.out.println("Int to Short : "+n4);

		char letter='B';

		int ch=letter;

		System.out.println("Char to Int : "+ch);

		int num=100;

		char ch2=(char) num;// Explicit type casting
		
		System.out.println("Int to char : "+ch2);

		float num1=14.56674f;

		double num2=num1;

		System.out.println("float to double : "+num2);

		double num3=14.50685048303;

		float num4=(float) num3;

		System.out.println("Double to float : "+num4);

	}
}