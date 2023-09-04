import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ne=new Scanner(System.in);
	    System.out.println("the cp");
	    double cp=ne.nextDouble();
	    System.out.println("the sp");
	    double sp=ne.nextDouble();
	    if(cp>sp)
       System.out.println("loss="+(cp-sp));
	    
        else if(cp<sp)
        
        System.out.println("profit="+(sp-cp));
        
        else
        System.out.println("same");
        
	   
	}
}
