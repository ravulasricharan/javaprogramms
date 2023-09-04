
class student
{
	public static void main(String args[])
{	
	String student_name="charan";
	char section='a';
	int s1=99,s2=99,s3=99,s4=99,s5=99,s6=99;
	int total=s1+s2+s3+s4+s5+s6;
	double max_marks=600;
	int donation=0;
	int schlorship=0;
	int fee=50000;
	double per=(total/max_marks)*100.0;
	System.out.println("per="+per);
	if(per>80)
	
{
	section='a';
	donation=0;
	schlorship=1000;
}
	if(per<80)
{
	section='b';
	donation=1000;
	schlorship=0;
}  

    System.out.println(section);
    System.out.println(donation);
    System.out.println(schlorship);
    double total_fee=fee+donation+schlorship;
    System.out.println(total_fee);
}
}

    
      
	