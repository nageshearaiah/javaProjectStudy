package Inheritence;



 abstract class shape {
	 
	 public abstract void shapetype();

}

 abstract class twodshape extends shape {
	 
	   public abstract void area ();
	 
	 
 }
 
 
 abstract class threeD extends shape {
	 
	 public abstract void areaforthreeD ();
 }
 
 
 class findshapetwo extends twodshape {
		 
   public void shapetype() {
	   
	   System.out.println("twodshape");
	   	   
   }
   public void area (){
	   
	   System.out.println("area of two d");
   }
 }
 
 
 class findshapet extends threeD {
	 
	 public void areaforthreeD()
	 {
		 System.out.println("area of three d");
	 }
	 
	 public void shapetype ()
	 {
		   System.out.println("threeDshape"); 
	 }
	 }
public class MoreIherit {
	
	
	public static void main(String[] args)
	
	{
		findshapet three = new findshapet();
		
		three.shapetype();
		three.areaforthreeD();
		
		findshapetwo two = new findshapetwo();
		
		two.shapetype();
		two.area();
		
	}
}
 

 