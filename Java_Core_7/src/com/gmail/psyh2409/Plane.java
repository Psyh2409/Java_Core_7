package com.gmail.psyh2409;

public abstract class Plane {
	public double length;
	public double width;
	public double weight;
	
	public void startEngines() {
		System.out.println("Take-off of the plane must be over " + (20 + (Math.random() * ((88 - 20) + 1))) + " minutes.");
	}
	public void takeOff() {
		System.out.println("There is enough fuel for " + Math.random() * 1000 + " km.");
	}
	
	public void landing() {
		System.out.println("Plane is landing. Good luck!");
	}
}
