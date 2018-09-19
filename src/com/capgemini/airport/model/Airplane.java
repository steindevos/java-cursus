package com.capgemini.airport.model;

public class Airplane {
    private String planeIdentification;
    private int maxNumberOfPassengers;
    private int currentNumberOfPassengers;
    private boolean currentlyFlying;
    private int cruiseSpeed;

    public Airplane(String planeIdentification, int maxNumberOfPassengers, int currentNumberOfPassengers, boolean currentlyFlying, int cruiseSpeed) {
        this.planeIdentification = planeIdentification;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.currentNumberOfPassengers = currentNumberOfPassengers;
        this.currentlyFlying = currentlyFlying;
        this.cruiseSpeed = cruiseSpeed;
    }

    public void loadPassengers() {
        if (currentlyFlying) {
            System.out.println("Awesome!");
            currentNumberOfPassengers = maxNumberOfPassengers;
        } else {
            currentNumberOfPassengers = maxNumberOfPassengers;
            System.out.println("Plane " + planeIdentification + " has " + currentNumberOfPassengers + " passengers on board and is ready to take off");
        }
    }

    public void unloadPassengers() {
        if (currentlyFlying) {
            System.out.println("What, no death flights in my code!");
        } else {
            currentNumberOfPassengers = 0;
            System.out.println("The plane is empty");
        }
    }

    public void takeOff() {
        System.out.println(planeIdentification + " takes off.");
        currentlyFlying = true;
    }

    public void landPlane() {
        System.out.println(planeIdentification + " has landed");
        currentlyFlying = false;
    }
}
