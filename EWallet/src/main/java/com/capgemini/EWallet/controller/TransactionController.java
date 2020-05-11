package com.capgemini.EWallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.capgemini.EWallet.entity.WalletTransactions;
import com.capgemini.EWallet.service.TransactionServiceImpl;

@RestController
@RequestMapping("/transaction")

public class TransactionController {
	
	@Autowired 
	TransactionServiceImpl transactionService; 
	
	@CrossOrigin 
	@GetMapping(value="/history{senderId}") 
	public List<WalletTransactions> transactionhistory(@PathVariable int senderId) {
		
	List<WalletTransactions> history = transactionService.transactionHistory(senderId);
	return history; 
}
	
	@CrossOrigin
	@PostMapping(value = "/transfer", consumes = { "application/json" })
	public String transferMoney(@RequestBody WalletTransactions transfer) {
		
		return transactionService.TransferAmount(transfer);
		 
	}

}