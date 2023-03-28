package com.busmanagement.service;

import java.util.List;

import com.busmanagement.entity.bus;




public interface BusService {
	
List<bus> getAllbus();
	
	bus save(bus bus);
	
	bus getbusById(String id);
	
	bus updatebus(bus bus);
	
	void deletebusById(String id);

}
