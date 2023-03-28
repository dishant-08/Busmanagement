package com.busmanagement.service.impl;

import java.util.List;

import com.busmanagement.entity.bus;
//import com.busmana.entity.Student;
import com.busmanagement.repository.BusRepository;
import com.busmanagement.service.BusService;

public class BusServiceImpl implements BusService {

	private BusRepository busrepository;

	public BusServiceImpl(BusRepository busrepository) {
		super();
		this.setBusrepository(busrepository);
	}

	public BusRepository getBusrepository() {
		return busrepository;
	}

	public void setBusrepository(BusRepository busrepository) {
		this.busrepository = busrepository;
	}
	
	@Override
	public List<bus> getAllbus() {
		return busrepository.findAll();
	}

	@Override
	public bus save(bus bus) {
		return busrepository.save(bus);
	}

	@Override
	public bus getbusById(String id) {
		return busrepository.findById(id).get();
	}

	@Override
	public bus updatebus(bus bus) {
		return busrepository.save(bus);
	}

	@Override
	public void deletebusById(String id) {
		busrepository.deleteById(id);	
	}
	
}
