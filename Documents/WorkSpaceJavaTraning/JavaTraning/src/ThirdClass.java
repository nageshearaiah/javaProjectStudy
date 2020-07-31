




class AdditionClass
{
	int classvar =-990;
	
	public void addTwoNumbers(int i, int j)
	
	{
	int k =0;
	k = i+j;
	System.out.println(k);
	System.out.println(classvar);
	
	}


	
	public void subtractTwoNumbers(int i,int j)
	{
	int k = 0;
	k = i-j;
	System.out.println("substracting " +k);
	classvar = -1000;
	System.out.println("substracting " + "Class variable is" +classvar);
	
	
		
	}
}


public class ThirdClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionClass b = new AdditionClass();
		AdditionClass a = new AdditionClass();
		
		
		a.addTwoNumbers(3,4);
		b.addTwoNumbers(5,6);
		a.subtractTwoNumbers(9, 1);
		b.addTwoNumbers(10, 11);
		
		
		
	}
}

	
	
	

	
	
	