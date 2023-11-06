package com.gmail.psyh2409;

public class Su_27 extends Plane implements SpecialFeaturesOfPlane{
	public double maxSpeed;
	public String color;
	public NavigatePlane np;
	
	public Su_27 (double maxSpeed, String color) {
		super.length = 22;
		super.width = 15;
		super.weight = 3000;
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.np = new NavigatePlane();
	}
	
	public void movementUp() {
		np.movementUp();
	}
	
	public void movementDown() {
		np.movementDown();
	}
	
	public void movementRight() {
		np.movementRight();
	}
	
	public void movementLeft() {
		np.movementLeft();
	}

	@Override
	public void startEngines() {
		// TODO Auto-generated method stub
		super.startEngines();
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		super.takeOff();
	}

	@Override
	public void landing() {
		// TODO Auto-generated method stub
		super.landing();
	}

	@Override
	public void turboAcselerator() {
		// TODO Auto-generated method stub
		System.out.println("Turbo Acselerator! Speed is " + (maxSpeed + Math.random()*(3000 - maxSpeed + 1)) + " km/h.");
	}

	@Override
	public void stealthMode() {
		// TODO Auto-generated method stub
		System.out.println("The plane will be invisible next " + Math.random()*100 + " minutes.");
	}

	@Override
	public void NuclearShock() {
		// TODO Auto-generated method stub
		System.out.println((int)(Math.random()*10) + " warheads will be dropped.");
	}
}
