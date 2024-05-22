package ex2;

import java.util.Random;

public class Calls {

    //attributes
    private int duration;
    private int callsNumber;

    //constructor
    public Calls() {
        Random random = new Random();
        this.duration = random.nextInt(1, 60);
        this.callsNumber = random.nextInt(300000000, 399999999);
    }

    //encapsulation

    public int getDuration() {
        return duration;
    }

    public int getNumber() {
        return callsNumber;
    }
}
