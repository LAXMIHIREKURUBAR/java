import java.util.*;
public class Arraymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];

Scanner r=new Scanner(System.in);
System.out.print("enter data in array");
for(int i=0;i<a.length;i++)
{
	a[i]=r.nextInt();
	
}

 Arrays.sort(a);

for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]+" ");
	
}

		
		
	}

}
