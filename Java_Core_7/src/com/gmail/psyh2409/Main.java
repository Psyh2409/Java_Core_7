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
Take-off of the plane must be over 84.42145483608873 minutes.
There is enough fuel for 719.6419654221903 km.
Movement up 15.686933938164238 km.
Movement left 34.19839036927089 km.
Movement down 9.40446130826318 km.
Movement right 0.8419057196456858 km.
The plane will be invisible next 10.1844314226623 minutes.
1 warheads will be dropped.
Turbo Accelerator! Speed is 2581.2349189748716 km/h.
Plane is landing. Good luck!
 */