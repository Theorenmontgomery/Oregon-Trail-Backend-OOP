package com.kenzie.library;

import java.sql.Array;
import java.util.ArrayList;

public class Wagon {
    //properties
    private int capacity;
    private Traveler[] passengers;

    // constructors
    public Wagon(int capacity) {
        this.capacity = capacity;
        this.passengers = new Traveler[capacity];
    }

    // methods
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Traveler[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Traveler[] passengers) {
        this.passengers = passengers;
    }

    public int getAvailableSeatCount() {
        int openSeats = 0;
        for (int i = 0; i < passengers.length; i++) {
            if (null == passengers[i]) {
                openSeats++;
            }

        }
        return openSeats;
    }

    public int join(Traveler traveler) {
        int numOfTravelers = 0;
        for (int i = 0; i < capacity; i++) {
            if (null == passengers[i]) {
                passengers[i] = traveler;
                break;
            }

        }
        return numOfTravelers;
    }

    public boolean shouldQuarantine() {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                if (!passengers[i].isHealthy) {
                    return true;
                }
            }
        }
        return false;

    }
    public int totalFood(){
        int foodCount =0;
        for (int i = 0; i < passengers.length; i++) {
            if(passengers[i] != null) {
                if (passengers[i].getFood()> 0) {
                    foodCount++;
                }
            }
        } return foodCount;
    }

    public void loadWagon(int numTravelers, int numHunters, int numDoctors) {
        //TODO: Hardcode at first. Once the program works, rewrite the method to loop and add programmatically
        //loop 3 times


        for (int i = 0; i < numDoctors; i++) {
            Doctor Doctor = new Doctor();
            this.join(Doctor);

        }

        for (int i = 0; i <numHunters ; i++) {

            Hunter Hunter = new Hunter();
            this.join(Hunter);

        }
        //Hard-coding to test: add two Travelers, one Doctor, one Hunter
        for (int i = 0; i < numTravelers ; i++) {

            Traveler traveler = new Traveler();
            this.join(traveler);
        }
        //Call new to make sure a unique Traveler is added


    }
}



