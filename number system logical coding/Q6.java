//6. Print true, if sum of squares of any 2 numbers is a 3rd given number
class Q6
{
	public static void main(String[] args) 
	{
		if(args.length < 3)
		{
			System.out.println("pls supply 3 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		boolean flag = false;
		if(((i*i + j*j) == k) || 
		   ((j*j + k*k) == i) || 
		   ((k*k + i*i) == j))
		{
			flag = true;
		}
		System.out.print(flag);
	}
}
