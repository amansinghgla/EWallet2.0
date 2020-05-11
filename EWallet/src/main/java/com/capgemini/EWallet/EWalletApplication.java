package com.capgemini.EWallet;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.EWallet.dao.WalletUserDao;
import com.capgemini.EWallet.entity.WalletUser;

@SpringBootApplication
public class EWalletApplication {
	public static void main(String[] args) {
		SpringApplication.run(EWalletApplication.class, args);
}
}

	

	
	
	



