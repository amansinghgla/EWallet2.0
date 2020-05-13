package com.capgemini.EWallet.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capgemini.EWallet.entity.WalletUser;
import com.capgemini.EWallet.dao.WalletUserDao;
import com.capgemini.EWallet.exception.WalletUserException;

@Service
public  class WalletUserServiceImpl  implements WalletUserService {
	
	@Autowired
	private WalletUserDao walletuserdao;

	@Override
	public List<WalletUser> getAllWalletUser() {
		// TODO Auto-generated method stub
		return walletuserdao.findAll();
	}
	
	@Override
	public WalletUser saveUser(WalletUser user) {
		return walletuserdao.save(user);
	}

	@Override
	public boolean addAccount(WalletUser walletuser) {
	
		WalletUser accountResult= walletuserdao.save(walletuser);
		if(accountResult!=null) {
			return true;
		}
		else
			return false;
	}
	}
	
	


