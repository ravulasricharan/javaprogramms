class fact
{
	public static void main(String args[])
	{
	int start=1,num=4,count=2;
	while(start<=num)
	{
		if(num%start==0)

		{
			count++;
		}
		start++;
	}
	if(count==2)
	{
	System.out.println("prime number");
	}
	else
	{
	System.out.println("not a prime number");
	}
	}
}
	