package com.kenzie.library;

import java.util.Random;

public enum Disaster {
    TORNADO,
    HURRICANE,
    EARTHQUAKE,
    STAMPEDE;
    public static Disaster getRandomDisaster(){
        Random random = new Random();
        return values()
                [random.nextInt(values().length)];
    }
}