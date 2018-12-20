package com.portfoliomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfoliomanagement.model.Asset;

//Inherit all variables and methods of class JpaRepository 
//Interface can only contain method signatures and fields. Interfaces form a contract between the class and the outside world

/*
 * Defining this interface serves two purposes: First, by extending JpaRepository we get a bunch of generic CRUD 
 * methods into our type that allows saving Accounts, deleting them and so on. Second, this will allow the Spring 
 * Data JPA repository infrastructure to scan the classpath for this interface and create a Spring bean for it.
 */


public interface AssetRepository extends JpaRepository<Asset, String>{
	
}