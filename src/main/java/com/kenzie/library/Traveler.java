package com.kenzie.library;

public class Traveler {
    //TODO: Code Traveler class
    //declare properties
    protected String name;
    protected int food;
    protected boolean isHealthy;

    //constructors
    public Traveler() {
        this.name = "";
        this.food = 1;
        this.isHealthy = true;

    }

    public Traveler(String name) {
        this();
        this.name = name;

    }

    //methods
    //hunt
    public void hunt() {
        this.food += 2;
    }

    //eat
    //set food to be deducted
    //if no food then make health false
    public void eat() {
        if (this.food > 0) {
            this.food -= 1;
        } else {
            setIsHealthy(false);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean getIsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }
}

class Doctor extends Traveler {
    //TODO: Code Doctor class
    //no variables needed

    //constructors
    public Doctor() {
        super();
    }

    public Doctor(String name) {
        super(name);
    }

    //define methods
    //getters/setters? no, it overrides
    public void heal(Traveler traveler) {
        traveler.isHealthy = true;
    }

}

class Hunter extends Traveler {
    //TODO: Code Hunter class
    public Hunter() {
        super();
        this.food = 2;
        this.name = "";
        this.isHealthy = true;
    }

    public Hunter(String hunter) {
        super();
    }

    public void hunt() {
        this.food += 5;
    }

    public void eat() {
        if (this.food >= 2) {
            this.food -= 2;
        } else {
            this.food = 0;
            setIsHealthy(false);
        }

    }

    public void giveFood(Traveler traveler, int numOfFoodUnits) {
      //check hunter has food
        //traveler gains food
        if(this.food>=numOfFoodUnits){
            this.food -= numOfFoodUnits;
            traveler.setFood(traveler.getFood()+numOfFoodUnits);
        }



        }

    }





