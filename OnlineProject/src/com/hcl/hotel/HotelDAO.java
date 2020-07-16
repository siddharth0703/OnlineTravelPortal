package com.hcl.hotel;

import java.util.List;

import com.hcl.flights.FlightDetails;

public interface HotelDAO {
	public void saveHotel (HotelDetails hotelDetails);
    public List<HotelDetails> showAllHotel();
     public void deleteHotel (HotelDetails hotelDetails);
}
