import java.util.Scanner;

public class Main
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter any Value :");
		
		String temp = scan.next();
		char a = temp.charAt(0);
		System.out.printf("Value is : %c",a);
		
		scan.close();
		
	}
}


