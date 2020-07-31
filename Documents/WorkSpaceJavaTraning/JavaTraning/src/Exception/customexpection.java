package Exception;
//import src.Inheritence;
 class customexpection1 extends Exception {
	 
	public void print(String a) {
		
		
		System.out.println(a);
	}
	 

}
class exp 
{
	int i ;
	
	public void expmethod (int i) throws customexpection1 {
	
	if (i > 10 )
	{
		throw new customexpection1();
		
	}
	else if (i < 0)
	{
		
		throw new customexpection1();
	}

}
}

public class customexpection {
	
	public static void main(String[] args) {
		

	
	exp e  = new exp();
	
	try {
		e.expmethod(100);
	} catch (customexpection1 e1) {
		// TODO Auto-generated catch block
		e1.print("out of range");
	}
	
	}	
	
}