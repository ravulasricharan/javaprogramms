class Emp
{
	public static void main(String args[])
{	
	String emp_name="charan";
	int basic_salary=25000;
	double ta=15;
	double da=12;
	double hra=19;
	double pf=0;
	double tax=0;
	ta=(ta/100.0)*basic_salary;
	da=(da/100.0)*basic_salary;
	hra=(hra/100.0)*basic_salary;
	System.out.println("ta=" +ta+ " "+"da="+da+" "+"hra="+hra);
    double total_salary=basic_salary+ta+da+hra;
    System.out.println(total_salary);
    if(total_salary>40000)
{
    pf=11;
    tax=5;
}
else
{
    pf=7;
    tax=2;
}
    pf=(pf/100.0)*total_salary;
    System.out.println(pf);
    tax=(tax/100.0)*total_salary;
    System.out.println(tax);
    total_salary=total_salary-pf-tax;
     System.out.println(total_salary);
     double total_salary_per_year=total_salary*12;
     System.out.println(total_salary_per_year);
     double per_day=(total_salary_per_year/365);
     System.out.println(per_day);
}
}