package org.example.lld.lift;

public class LiftRunner {
    public static void main(String[] args) {
        Lift lift = new Lift(1);

        Thread thread = new Thread() {
            public void run() {
//                lift.startLift();
            }
        };

        thread.start();
    }
}
