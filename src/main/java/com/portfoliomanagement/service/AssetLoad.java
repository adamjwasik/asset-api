package com.portfoliomanagement.service;

import com.portfoliomanagement.model.Asset;
import com.portfoliomanagement.repository.AssetRepository;


//import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class AssetLoad {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AssetLoad.class);

    /*Spring Boot runs all CommandLineRunner beans once the applicaiton context is loaded*/
    
	@Bean
	CommandLineRunner initDatabase(AssetRepository repository) {
		return args -> {
			//log.info("Preloading " + repository.save(new Asset("VCSH", "Vanguard Short-Term Corporate Bond ETF")));
			//log.info("Preloading " + repository.save(new Asset("VCR", "Vanguard Consumer Discretionary ETF")));
		};
	}
}