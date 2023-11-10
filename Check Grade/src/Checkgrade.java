import java.util.Scanner;

public class Checkgrade {
	public static void CheckGrade(int grade) {
		if(grade>55) 
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("not pass");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("grade");
		int grade=sc.nextInt();
		CheckGrade(grade);
	}

}
