package com.capgemini.EWallet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.EWallet.entity.WalletAccount;

public interface AccountDao extends JpaRepository<WalletAccount,Integer>{
	

}