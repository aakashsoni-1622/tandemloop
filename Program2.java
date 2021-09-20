import java.util.*;
class Program2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Input Please :");
		String input = s.nextLine();
		String result="";
		int n;
		for (int j=0;j<input.length();j++)
		{
			char charCheck = input.charAt(j);
			if (Character.isDigit(charCheck))
			{
				result += charCheck;
			}
		}
		
		n = Integer.parseInt(result);
		int i;

		for (i=1;i<=2*n;i++)
		{
			if (i%2==0)
			{
				continue;
			}
			else{
				System.out.print(i+ " ");		
			}
		}
		
	}
}
