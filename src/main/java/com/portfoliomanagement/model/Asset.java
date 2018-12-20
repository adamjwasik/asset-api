package com.portfoliomanagement.model;

import lombok.Data;		//Lombok annotation to create all the getters, setters, equals, hash, and toString methods, based on the fields.

// Java Persistence is the API for the management for persistence and object/relational mapping.
// import annotations 
import javax.persistence.Entity;  			//Specifies that the class is an entity.
import javax.persistence.GeneratedValue;	//Provides for the specification of generation strategies for the values of primary keys.
import javax.persistence.Id;				//Specifies the primary key of an entity.
import javax.persistence.EntityResult;		//EntityResult

@Data		
@Entity
public class Asset {
	
	private @Id String symbol;
	private String name;
	private String currency;
	private String assetType;
	private double quantity;
	private double posCost;
	private double mrktPrice;
	private double pandl;
	private float perc_return;
		
	
	Asset(){}
	
	public Asset(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
}
