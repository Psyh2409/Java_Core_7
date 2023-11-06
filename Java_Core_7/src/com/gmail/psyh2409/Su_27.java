package com.gmail.psyh2409;

public class Su_27 extends Plane implements SpecialFeaturesOfPlane{
	public double maxSpeed;
	public String color;
	public NavigatePlane np;
	
	public Su_27 (double maxSpeed, String color) {
		super.length = 22;
		super.width = 15;
		super.weight = 23000;
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.np = new NavigatePlane();
	}
	
	public void moveUp() {
		np.moveUp();
	}
	
	public void moveDown() {
		np.moveDown();
	}
	
	public void moveRight() {
		np.moveRight();
	}
	
	public void moveLeft() {
		np.moveLeft();
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
	public void nuclearShock() {
		// TODO Auto-generated method stub
		System.out.println((int)(Math.random()*10) + " warheads will be dropped.");
	}
}
