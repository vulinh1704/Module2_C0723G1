package Imple;

import Inter.AnimalFly;
import Inter.Flyable;

class Bird implements Flyable, AnimalFly {

    @Override
    public String fly() {
        return null;
    }

    @Override
    public void fly(boolean isFly) {

    }

    @Override
    public void run() {
        Flyable.super.run();
    }
}
