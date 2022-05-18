
class RaceTrack{
	
	public static void main(String[] args){
		
		System.out.println("Inside RaceTrack main method");
		Car c1 = new Car(2012,"ABC",130.00);
		System.out.println();
		System.out.println(c1.getYear());
		System.out.println(c1.getMake());
		System.out.println(c1.getSpeed());
		
		System.out.println("");
		
		c1.accelerate();
		System.out.println("New speed :- "+c1.getSpeed());
		
		
		
	}
}