package com.assignment;

import java.util.Scanner;

class Elevator{
	private int currentFloor;
	int min_floor=1;
	int max_floor=10;
	public Elevator() {
		currentFloor=1;
	}
	public void selectFloor(int floor) throws InvalidFloorException {
		if(floor<min_floor || floor>max_floor) {
			throw new InvalidFloorException("Invalid floor selection");
		}
		
		if(floor==currentFloor) {
			System.out.println("You are already on floor "+floor+".");
		}
		String direction =(floor > currentFloor)?"up":"down";
		System.out.println("Going "+direction+"..");
		while(currentFloor != floor) {
			if(direction.equals("up")) {
				currentFloor++;
			}else {
				currentFloor--;
			}
			System.out.print(currentFloor+"..");
		}
		System.out.println("Ding!");
	}
	public void fireAlarm() {
		System.out.println("Danger! You must exit the building now!");
		try {
		selectFloor(1);
		}catch (InvalidFloorException e) {
			System.out.println(e.getMessage());
		}
	}
}
class InvalidFloorException extends Exception{
	public InvalidFloorException(String message) {
		super(message);
	}
}
public class ElevatorDriver {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Elevator elevator= new  Elevator();
	String choice;
    do {
    	System.out.println("Options: (s)elect floor, (f)ire alarm, (q)uit");
    	System.out.println("Enter 's','f', or 'q' => ");
    	choice = sc.nextLine();
    	switch(choice) {
    	case "s":
    		System.out.println("Enter floor that you would like to go to => ");
    		int floor= sc.nextInt();
    		sc.nextLine();
    		try {
				elevator.selectFloor(floor);
			} catch (InvalidFloorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e){
				System.out.println("Invalid input. Please try again.");
				sc.nextLine();
			}
    		break;
    	case "f":
    		elevator.fireAlarm();
    		break;
    	case "q":
    		System.out.println("Exiting the elevator program");
    		break;
    	default: 
    		System.out.println("Invalid Selection");
    		break;
    	}
    }while(!choice.equals("q"));
    sc.close();
}
}

