package com.capgemini.EWallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capgemini.EWallet.entity.WalletUser;
import com.capgemini.EWallet.dao.WalletUserDao;

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
	
	

}
