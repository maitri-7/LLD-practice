package org.example.lld.lift.states;

import org.example.lld.lift.Lift;
import org.example.lld.lift.model.Direction;

public interface LiftState {
    boolean canAcceptRequest(Lift lift, Integer customerCurrentFloor, Direction direction);
}
