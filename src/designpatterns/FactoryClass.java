package designpatterns;

public class FactoryClass {
	public static void main(String args[]) {
		
	}
	
	
	public static Vehicle getVehicle (String type) {
		Vehicle vehicle = new Car();
		
		if (type.equalsIgnoreCase("truck"))
			vehicle =  new Truck();
		else if (type.equalsIgnoreCase("Boat"))
			vehicle = new Boat();
		
		return vehicle;
		
	}
}
