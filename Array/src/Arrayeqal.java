import java.util.Scanner;
import java.util.Arrays;

public class Arrayeqal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int a2[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.print("enter data in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
			
		}
		System.out.print("enter data in array2");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=r.nextInt();
			
		}
		boolean b=Arrays.equals(a,a2);
		System.out.println("array is equal OR NOT :"+b);

	}

}
