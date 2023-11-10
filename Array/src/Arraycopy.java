import java.util.Arrays;
import java.util.Scanner;

public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];

		Scanner r=new Scanner(System.in);
		System.out.print("enter data in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
			
		}
		int a2[]=Arrays.copyOf(a, 5);
		System.out.print("enter data in array2");
		for(int i=0;i<a2.length;i++)
		{
			System.out.println(a2[i]+" ");
		}
	}

}
