
 class AreaRect {
	double len = 123.34, breadth = 234.34;
	AreaRect() {
	}
	
	
	
	AreaRect (double l, double b)
	{
		len = l;
		breadth = b;
	}
  public double  area()
  {
	   double  area = len * breadth;
	   return  area ;
	   
	   
  }
}
 
 public class AreaRectangle {
	 
	 public static void main(String[] args) {
		 
		 AreaRect a = new AreaRect(21.5,30.25);
		 AreaRect b = new AreaRect();
		 
		 
		 double recarea = a.area();
		 System.out.println("Rectangle area ===="+recarea);
		 double recarea1 = b.area();
		 System.out.println("Rectangle area ===="+recarea1);
	 }
	 
	 
 }

 

