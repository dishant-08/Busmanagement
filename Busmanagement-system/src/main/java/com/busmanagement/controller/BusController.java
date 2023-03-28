package com.busmanagement.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.busmanagement.entity.bus;
import com.busmanagement.service.BusService;

public class BusController {

	private BusService busService;
	
	public BusController(BusService busService) {
		super();
		this.busService = busService;
		}

	public BusService getBusService() {
		return busService;
	}

	public void setBusService(BusService busService) {
		this.busService = busService;
	}
	
	@PostMapping("/bus")
	public ResponseEntity<bus> save(@RequestBody bus bus){
		return new ResponseEntity<bus>(busService.save(bus),HttpStatus.CREATED);
	}
	
    @GetMapping
    public List<bus> getAllbus(){
    	return busService.getAllbus();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<bus> getbusById(@PathVariable("id") String id){
    	return new ResponseEntity<bus>(busService.getbusById(id),HttpStatus.OK);
    }
    
     @PutMapping("/{id}")
     public ResponseEntity<bus> updatebus(@RequestBody bus bus){
    	 return new ResponseEntity<bus>(busService.updatebus(bus), HttpStatus.OK );
     }
	
     @DeleteMapping("/{id}")
     public ResponseEntity<String> deletebusById(@PathVariable("id") String id){
    	 busService.deletebusById(id);
    	 
    	 return new ResponseEntity<String>("Bus Deleted Sucessfully" , HttpStatus.OK);
     }
}
