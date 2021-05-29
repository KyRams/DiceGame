// Filename Die.java
// Written by Kyle Ramsay
// Written on 03 Feb 2021

public class Die {
    final int HIGHEST_DIE_VALUE = 6;
    final int LOWEST_DIE_VALUE = 1;
    int roll;

    public Die() {
        roll = ((int) (Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
    }

    public void pDisplay() {
        System.out.println("Your rolled dice are: " + roll);
    }

    public void cDisplay() {
        System.out.println("Computers rolled dice are: " + roll);
    }
}