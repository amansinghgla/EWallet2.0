package com.capgemini.EWallet.service;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import java.util.Optional;

import com.capgemini.EWallet.entity.WalletTransactions;
import com.capgemini.EWallet.exception.TransactionException;
import com.capgemini.EWallet.entity.WalletAccount;
import com.capgemini.EWallet.dao.AccountDao;
import com.capgemini.EWallet.dao.TransactionDao;

@Service
@Transactional
public  class TransactionServiceImpl implements TransactionService{
	
	
	
	@Autowired
	TransactionDao transferdao;
	
	@Autowired
	AccountDao accountdao;
	
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
	public String TransferMoney(int senderId,int recieverId,double amt) throws TransactionException {
		// TODO Auto-generated method stub
    	WalletAccount SenderAccount, RecieverAccount;
		Optional<WalletAccount> SenderAccountOp=accountdao.findById(senderId);
		if(SenderAccountOp.isPresent()) {
			SenderAccount=SenderAccountOp.get();
		}
		else {
			throw new TransactionException("Sender ID is not present");
		}
		
		Optional<WalletAccount> RecieverAccountOp=accountdao.findById(recieverId);
		if(RecieverAccountOp.isPresent()) {
			RecieverAccount=RecieverAccountOp.get();
		}
		else {
			throw new TransactionException("Reciever ID is not present");
		}
		
		if(SenderAccount.getAccountBalance() < amt) throw new TransactionException("Insufficient Balance");
		SenderAccount.setAccountBalance(SenderAccount.getAccountBalance()-amt);
		RecieverAccount.setAccountBalance(RecieverAccount.getAccountBalance()+amt);
		accountdao.updateBalance(SenderAccount.getAccountBalance(), SenderAccount.getAccountId());
		accountdao.updateBalance(RecieverAccount.getAccountBalance(), RecieverAccount.getAccountId());
		return "Transaction Successfully Completed";
    }
		
		@Override
		@Transactional(readOnly = true)
		public List<WalletTransactions> viewAllTransactions(){
			return transferdao.findAll();
		

}
}