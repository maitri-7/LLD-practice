package org.example.lld.lift.states;

import org.example.lld.lift.model.Direction;
import org.example.lld.lift.Lift;

public class MovingDownState implements LiftState {

    @Override
    public boolean canAcceptRequest(Lift lift, Integer customerCurrentFloor, Direction direction) {
        return lift.getCurrentFloor() > customerCurrentFloor && direction.equals(Direction.DOWN);
    }
}
