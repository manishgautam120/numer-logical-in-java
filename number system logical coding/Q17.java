//17. Find out given number is a palindrome or not?
class Q17
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("enter 1 cla");
			return;
		}
		int num1 = Integer.parseInt(args[0]); //123
		int i = num1, reverseNum1 = 0, digit;
		while(i != 0)
		{
			digit = i % 10;
			reverseNum1 = reverseNum1 * 10 + digit;
			i = i / 10;
		}
		if(num1 == reverseNum1)
		{
			System.out.println(num1 + " is palindrom");
		}
		else
		{
			System.out.println(num1 + " is not a palindrom");
		}
	}
}
