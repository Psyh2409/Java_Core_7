package com.gmail.psyh2409;

public class NavigatePlane {
	
	public void moveUp() {
		System.out.println("Movement up " + Math.random()*100 + " km.");
	}
	
	public void moveDown() {
		System.out.println("Movement down " + Math.random()*100 + " km.");
	}
	
	public void moveRight() {
		System.out.println("Movement right " + Math.random()*100 + " km.");
	}
	
	public void moveLeft() {
		System.out.println("Movement left " + Math.random()*100 + " km.");
	}
	
}
