
 class Vehicle1 {
	int engine;
	int hadle;
	int brk;
	
	public void move()
	{
		System.out.println("Vehicle is moving");
	}
	public void stop()
	
	{
		System.out.println("Vehicle has stopped");
	}

}

class fourwheelers extends Vehicle1 {
		
		int numberofwheels;
		int colour;
		String vendor;
		
		public void opendoor()
		{
			System.out.println("CAR door opened");
		}
		
		public void closedoor()
		{
			System.out.println("CAR door is closed");
		}
		
		
		}
class heavyvehicles extends Vehicle1 {
	
	int numberoftyres;
	int power;
	
	
}

public class Vehicle {
	
	 public static void main(String[] args){
		 
		 heavyvehicles h = new heavyvehicles();
		 h.stop();
		 
		 
		 fourwheelers f = new fourwheelers();
		 f.move();
		 f.opendoor();
		 f.closedoor();
	
}
}

		