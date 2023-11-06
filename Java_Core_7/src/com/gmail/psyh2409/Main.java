package com.gmail.psyh2409;

public class Main {
	public static void main(String[] args) {
		Su_27 su = new Su_27(2500, "blue");
		su.startEngines();
		su.takeOff();
		su.movementUp();
		su.movementLeft();
		su.movementDown();
		su.movementRight();
		su.stealthMode();
		su.NuclearShock();
		su.turboAcselerator();
		su.landing();
		}
}
/* Output:
Take-off of the plane must be over 60.517699520133974 minutes.
There is enough fuel for 823.0379029591234 km.
Movement up 7.830892932904754 km.
Movement left 8.392147300362662 km.
Movement down 57.7505244833775 km.
Movement right 5.263914463499864 km.
The plane will be invisible next 89.60463394260381 minutes.
9 warheads will be dropped.
Turbo Acselerator! Speed is 2937.702448964666 km/h.
Plane is landing. Good luck!
 */