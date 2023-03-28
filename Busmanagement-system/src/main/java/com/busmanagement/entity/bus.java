package com.busmanagement.entity;

import java.sql.Time;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "BusManagement")
@Entity
public class bus {
	
	
	public enum type {
        EXPRESS, PASSENGER, NONSTOP
    }
    public enum trip {
        up, down
    }
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String route;
    private String trip;
    private String type;
    private Time starttime;
    private Time endtime;

}
