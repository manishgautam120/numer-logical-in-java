//11. Print java for multiples of 4 and 
//    print j2ee for multiples of 5 and 
//    if number is multiple of 4 and also 5, then print lara. 
//    Continue till to 100.
class Q11
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 100; i++)
		{
			if(i % 20 == 0)
			{
				System.out.println(i + ":lara");
			}
			else if(i % 4 == 0)
			{
				System.out.println(i + ":java");
			}
			else if(i % 5 == 0)
			{
				System.out.println(i + ":j2ee");
			}
		}
	}
}
