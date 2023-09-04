public class Main
{
	public static void main(String[] args) {
	    String health="excellent";
	    String health_1="bad";
	    int age=30;
	    String city="c";
	    String village="v";
	     int per_thousand=4;
	     String gender="male";
	     String gender2="female";
	     int policy_amount=200000;
	     int polic_amount2=100000;
	     int policy_amount3=10000;
	     
	     if((health=="excellent") &&(gender=="male")&& ((age>=25) && (age<=35))&&(city=="c"))
	     {
	         double sur=(policy_amount/1000.0)*4;
	         System.out.println(sur);
	      if((health=="excellent")&&(gender2=="female")&&(age>=25)&&(age<=35)&&(city=="c"))
	      {
	          double sur1=(polic_amount2/1000.0)*3;
	          System.out.println(sur1);
	      }
	      else if((health_1=="bad")&&(gender2=="female")&&(age>=25)&&(age<=35)&&(village=="v"))
	              {
	              double sur2=(policy_amount3/1000.0)*6;
	              System.out.println(sur2);
	              
	          }else
	          {
	              System.out.println("  not appicable");
	          }
	      }
	     
	     else
	     {
	     	System.out.println("not applicable");
	     }
	     	 
	   
	     	
	     }
	}

