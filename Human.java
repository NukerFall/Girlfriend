package me.carefall.coding;

public class Human {

    private boolean dead;
    private boolean sleeping;

    public boolean isDead() {
        return dead;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void die() {
        this.dead = true;
    }

    public void setSleeping(boolean newSleepingState) {
        this.sleeping = newSleepingState;
    }

    public void kiss (Human human) {
        // kiss code
    }

    public void punch(Human human) {
        // punch code
    }

    /*
    * code...
    */
}
