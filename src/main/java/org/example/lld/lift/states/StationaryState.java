package org.example.lld.lift.states;

import org.example.lld.lift.Lift;
import org.example.lld.lift.model.Direction;

public class StationaryState implements LiftState{

    @Override
    public boolean canAcceptRequest(Lift lift, Integer customerCurrentFloor, Direction direction) {
        return true;
    }
}
