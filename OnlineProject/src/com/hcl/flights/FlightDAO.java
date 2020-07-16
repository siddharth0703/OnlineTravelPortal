package com.hcl.flights;

import java.util.List;

public interface FlightDAO {
	 public void saveFlight (FlightDetails flightDetails);
	    public List<FlightDetails> showAllFlight();
	     public void deleteFlight (FlightDetails flightDetails);
}
