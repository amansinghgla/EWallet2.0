package com.capgemini.EWallet.service;


import java.util.List;


import com.capgemini.EWallet.entity.WalletAccount;
import com.capgemini.EWallet.entity.WalletTransactions;
import com.capgemini.EWallet.exception.TransactionException;

public interface TransactionService {
	
	String TransferMoney(int senderId, int recieverId, double amt) throws TransactionException;
	
	List<WalletTransactions> viewAllTransactions();
}


