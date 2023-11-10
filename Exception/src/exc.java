
public class exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="12345";
try
{
	int a=Integer.parseInt(str);
	System.out.println(a);

	
	
}

catch(NumberFormatException n)
{
	System.out.println("string "+str+" can't converted into integer");
}
	}

}
