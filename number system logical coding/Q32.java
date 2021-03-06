// 32. Develop a program to print 30 prime numbers 
// which are having digits in the descending order after 10. 
// (Example: 31, 41, 43, 51, 53, 61, 71, 73, ,��)

class Q32
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		int i = 10;
		int count = 0;
		while(count < 30)
		{
			for(int j = 2; j <= (i / 2); j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime && isRaisingOrder(i))
			{
				System.out.print(i + ", ");
				count ++;
			}
			isPrime = true;
			i++;
		}
	}
	static boolean isRaisingOrder(int i)
	{
		boolean isRaising = true;
		int j = i, currentDigit, prevDigit = i % 10;
		j = j / 10;
		while(j != 0)
		{
			currentDigit = j % 10;
			if(currentDigit <= prevDigit)
			{
				isRaising = false;
				break;
			}
			prevDigit = currentDigit;
			j = j / 10;
		}
		return isRaising;
	}
}
