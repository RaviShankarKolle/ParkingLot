package com.nt.repo;

import java.util.HashMap;

import com.nt.Exceptions.GateNotFoundException;
import com.nt.models.Gate;

public class GateRepository {
	private HashMap<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(int gateId) throws GateNotFoundException {
        Gate gate = gateMap.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("Gate not found for Id : " + gateId);
        }
        return gate;
    }

    public Gate put(Gate gate){
        gateMap.put(gate.getId(), gate);
        return gate;
    }
}
