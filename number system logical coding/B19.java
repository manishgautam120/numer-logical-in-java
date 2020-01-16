class B19
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		int sum = 0, digit;
		for(; num != 0; num = num / 10)
		{
			digit = num % 10;
			sum = sum + digit;
		}
		System.out.println(sum);
	}
}
