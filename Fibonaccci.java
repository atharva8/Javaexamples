
public class Fibonaccci {
	public static void main(String[] args)
	{
		int b=1;
		int c=1;
		int d=0;
		System.out.print(b+" ");
		System.out.print(c+" ");
		while(d<50)
		{
			d=b+c;
			System.out.print(d+" ");
			b=c;
			c=d;
		}
	}
}
