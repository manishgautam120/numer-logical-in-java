//22. Develop a program to print initial 20 prime numbers?
class Q22
{
	public static void main(String[] args) 
	{
		int count = 0;
		boolean isPrime = true;
		int i = 2;
		while(count < 20)
		{
			for(int j = 2; j <= (i / 2); j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i + ", ");
				count ++;
			}
			isPrime = true;
			i++;
		}
	}
}
