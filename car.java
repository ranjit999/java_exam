/*
Create a new Java class named Car that has the following private fields
⚫ year - The year field is an int that holds a car's year model (e.g. 2010)
⚫ make - The make field is a String object that holds the make of the car (e.g. "Porsche")
⚫ speed - The speed field is an double that holds a car's current speed (e.g. 25.0)
*/
class Car{
	
	private int year;
	private String make;
	private double speed;
	
	Car(int year, String make, double speed){
		
		this.year = year;
		this.make = make;
		this.speed = speed;
		
	}
	
	public int getYear(){
		return this.year;
		
	}
	
	public String getMake(){
		return this.make;
	}
	
	public double getSpeed(){
		return this.speed;
	}
	
	public void accelerate(){
		
		this.speed++;
	}
	
}




