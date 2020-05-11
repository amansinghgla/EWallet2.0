package com.capgemini.EWallet.service;


import java.util.List;

import com.capgemini.EWallet.entity.WalletAccount;
import com.capgemini.EWallet.entity.WalletTransactions;

public interface TransactionService {
	public WalletAccount findAccount(int accountId);
	public String TransferAmount(WalletTransactions transfer);
	public void updateBalance(int accountId, double amount);
	public List<WalletTransactions> transactionHistory(int senderId) ;

}


