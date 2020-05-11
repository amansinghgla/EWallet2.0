package com.capgemini.EWallet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.EWallet.entity.WalletTransactions;

@Repository
public interface TransactionDao extends JpaRepository<WalletTransactions, Integer> {
	List<WalletTransactions> findBySenderId(int senderId);

}