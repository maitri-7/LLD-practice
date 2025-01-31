package org.example.lld.lift;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.lld.lift.states.LiftState;
import org.example.lld.lift.states.StationaryState;

import java.util.List;
import java.util.Map;

@Data
@Getter
@Setter
public class Lift {
    private LiftState liftState;
    private Integer currentFloor;
    private Integer id;
    private Integer destination;
    Map<Integer, Boolean> requests;

    public Lift(Integer id) {
        this.liftState = new StationaryState();
        this.currentFloor = 0;
        this.id = id;
    }

    private Map.Entry<Integer, Boolean> getLatestRequest(){
        return requests.entrySet().iterator().next();
    }

//    private void processRequest() {
//        int destinationFloor = getLatestDestionation();
//        for (int i=currentFloor; i != destinationFloor; i+= (currentFloor > destinationFloor) ? -1 : 1) {
//            System.out.println("Reached floor: " + i);
//            if (currentFloor.equals(latestRequest.getKey())) {
//                System.out.println("Adding destination " + latestRequest.getValue());
//
//            }
//        }
//    }

//    public void pollRequests() {
//        while (true) {
//            if (this.liftState instanceof StationaryState) {
//                processRequest();
//            } else {
//                //wait until lift is back to stationary state
//            }
//        }
//    }
//
//    public void startLift() {
//        pollRequests();
//    }


}
