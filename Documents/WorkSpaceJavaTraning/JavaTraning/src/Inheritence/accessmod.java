package Inheritence;

 class accessmoda {
	
	int i;
	

	private  void display()
	{
		System.out.println("displayprivate ");
		
	}
public void maindisplay()
{
	display();
}
}

public class accessmod {

public static void main(String[] args)
{
	accessmoda   d = new accessmoda();
	
	d.maindisplay();
    

}
}