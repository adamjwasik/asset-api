package com.portfoliomanagement.model;

import lombok.Data;		//Lombok annotation to create all the getters, setters, equals, hash, and toString methods, based on the fields.
import javax.persistence.Entity;  			//Specifies that the class is an entity.
import javax.persistence.GeneratedValue;	//Provides for the specification of generation strategies for the values of primary keys.
import javax.persistence.Id;				//Specifies the primary key of an entity.
import javax.persistence.EntityResult;		//EntityResult

@Data
@Entity
public class Account{
	
	private @Id String accountNumber;
	private String accountType;
	private String institution;
	
	public Account(String accountNumber, String accountType, String institution) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.institution = institution;
	}
	
}