class UnaryOp
{
	


	public static void main(String[] args) {
		
		int a=20,b=15,c=50;

		int d=(a++)+(b++); //20++ (+) 15++

		int e=(++a)+(b++); //++21 +  16++

		System.out.println(" A  value "+a);//22
		System.out.println("B Value : "+b);// 17
		System.out.println("D value is : "+d);  //35

		System.out.println("E value is : "+e);
	}
}