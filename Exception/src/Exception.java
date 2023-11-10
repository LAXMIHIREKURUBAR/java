
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		int a=10,b=0,c;
		try {
			
		
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divide by zero");
		}
		System.out.println("main method started");
		

	}

}
