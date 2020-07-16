package com.hcl.bikes;

import java.util.List;

public interface BikeDAO {
	public void saveBike (BikeDetails bikeDetails);
	public List<BikeDetails> showAllBike();
	public void deleteBike (BikeDetails bikeDetails);
}
