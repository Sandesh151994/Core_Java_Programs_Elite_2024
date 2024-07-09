import java.util.Scanner;
class SwitchStatement
{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int a=20,b=30;

		int res;

		System.out.println("Enter the operation to perform");

		char op=sc.next().charAt(0);

		switch(op)
		{

		case '+' : res=a+b;
			System.out.println("Addition : "+res);
			break;
		case '-' : res=a-b; 
		System.out.println("Subtraction : "+res);
		break;
		case '*' : res=a*b;
			System.out.println("Multiplication : "+res);
			break;
		case '/' : res=a/b;
			System.out.println("Division : "+res);
			break;
		default : System.out.println("Invalid Operator");
		}

		
	}
}