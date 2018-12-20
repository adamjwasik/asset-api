package com.portfoliomanagement.model;

import java.util.Date;
import java.util.Currency;

import lombok.Data;		//Lombok annotation to create all the getters, setters, equals, hash, and toString methods, based on the fields.

// Java Persistence is the API for the management for persistence and object/relational mapping.
// import annotations 
import javax.persistence.Entity;  			//Specifies that the class is an entity.
import javax.persistence.Id;				//Specifies the primary key of an entity.
import javax.persistence.EntityResult;		//EntityResult
import javax.persistence.GeneratedValue;	//Provides for the specification of generation strategies for the values of primary keys.
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;
//import org.springframework.samples.petclinic.rest.JacksonCustomOwnerDeserializer;
//import org.springframework.samples.petclinic.rest.JacksonCustomOwnerSerializer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@Data		
@Entity		//All entity classes must define a primary key, must have a non-arg constructor and or not allowed to be final.
@Table(name="POSITION")		//Ability to change the table name (default is class name)
public class Position {
	
	private enum TradeType {BUY,SELL};
	private enum CurrencyType {CAD,USD};
	
	private @Id String symbol;
	private @Id Date purchaseDate;
	private Currency purchaseCost;
	private double quantity;
	
	private TradeType tradeType;
	private CurrencyType currencyType;
	
	Position(){}	//Requirement as per Entity Class
	
	public Position(String symbol, Date purchaseDate, Currency purchaseCost, double quantity, TradeType tradeType, CurrencyType currencyType ){
		this.symbol = symbol;
		this.purchaseDate = purchaseDate;
		this.purchaseCost = purchaseCost;
		this.quantity = quantity;
		this.tradeType = tradeType;
		this.currencyType = currencyType;
		
	}
}