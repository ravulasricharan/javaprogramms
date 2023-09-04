public class Main
{
	public static void main(String[] args) {
	    int a=19;
	    int root=(int)Math.sqrt(a);
		System.out.println(root);
    	int root_1=root*root;
		if(a==(double)root_1)
		{
		    System.out.println("perfect");
		}
		else
		System.out.println("not perfect");
	}
}