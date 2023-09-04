class nested
{
	public static void main(String args[])
        {
	int num1=124,num2=3333344,num3=13344;
	if(num1>num2)
        {
	if(num1>num3)
        {
	System.out.println("num1_is_greater_number="+num1);
        }
	else
        {
	System.out.println("num3_is_greater_number="+num3);
	}
	}
	else
	{
	if(num2>num3)
	{
	System.out.println("num2_is_greater_number="+num2);
	}
	else
	{
	System.out.println("num3_is_greater_number="+num3);
	}
	}

}
}