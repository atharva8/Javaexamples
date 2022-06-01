
public class Palin {
	public static void main(String args[])
	{
		int n = 121;
		int b = n;
		int a = 0;
		while(n>0)
		{
			int d = n%10;
			a=a*10+d;
			n=n/10;
		}
		System.out.println(b);
		if(b==a)
		{
			System.out.println(b+"is palindrome");
		}
		else
		{
			System.out.println(b+"is not palindrome");
		}
	}
}
