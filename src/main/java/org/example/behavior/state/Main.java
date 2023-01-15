package org.example.behavior.state;

public class Main {
    public static void main(String[] args) {
        State badState = new BadMoodState();
        scenario(badState);
    }

    public static void scenario(State state){
        System.out.println(state.morningGreet());
        System.out.println(state.getProtectionForCold());
    }

}
