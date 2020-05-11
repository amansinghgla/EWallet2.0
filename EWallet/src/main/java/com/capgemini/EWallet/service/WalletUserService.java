package com.capgemini.EWallet.service;

import java.util.List;

import com.capgemini.EWallet.entity.WalletUser;


public interface WalletUserService {
	
	List<WalletUser> getAllWalletUser();
	
	WalletUser saveUser(WalletUser user);

}
