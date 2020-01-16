//12. Find out whether digits are in raising order or not in a given numer?
class Q12
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("enter 1 cla");
			return;
		}
		int num = Integer.parseInt(args[0]);
		boolean isRaisingOrder = true;
		//num = 23456
		int i = num, currentDigit, prevDigit = num % 10;
		i = i / 10;
		while(i != 0)
		{
			currentDigit = i % 10;
			if(prevDigit < currentDigit)
			{
				isRaisingOrder = false;
				break;
			}
			prevDigit = currentDigit;
			i = i / 10;
		}
System.out.println(num + " is in RaisingOrder:" + isRaisingOrder);
	}
}
