package com.capgemini.airport;

import com.capgemini.airport.model.Airplane;

public class Application {

    public static void main(String[] args) {
	    Airplane plane1 = new Airplane("AAA111", 150, 0, false, 0);
        Airplane plane2 = new Airplane("BBB222", 240, 0, false, 0);

	    plane1.loadPassengers();
	    plane1.takeOff();
	    plane1.unloadPassengers();
	    plane1.landPlane();
	    plane1.unloadPassengers();

        plane2.loadPassengers();
        plane2.takeOff();
        plane2.landPlane();
        plane2.unloadPassengers();

    }
}
