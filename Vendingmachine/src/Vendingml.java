import java.util.*;
public class Vendingml {
	public static void getProduct(String productCode)
	{
		if(productCode.equals("P01"))
		{
			System.out.println("coco-cola");
			
		}
		else if(productCode.equals("P02"))
		{
			System.out.println("string");
		}
		
		
		else if(productCode.equals("P03"))
		{
			System.out.println("maaza");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" enter product Code");
String Code=sc.next();
getProduct(Code);

	}

}
