package day_41_;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {
		System.out.println("Car make: [" + make + "] , model [" + model + "] , color[" + color + "]");
	}

	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed <= speedLimit) {
			System.out.println(
					make + " is driving at " + currentSpeed + " mph, following the speed limit -" + speedLimit);
		} else {
			System.out.println(make + " is driving at " + currentSpeed + " mph, over the speed limit -" + speedLimit);
		}
	}

	public void drive() {
		System.out.println(make + " " + model + " is driving");
	}

	public void accellerate(int mph) {
currentSpeed=currentSpeed+mph;
System.out.println(currentSpeed);
	}
}
