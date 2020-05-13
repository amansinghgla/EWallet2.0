package com.capgemini.EWallet.service;

import java.util.List;



import com.capgemini.EWallet.entity.WalletUser;
import com.capgemini.EWallet.exception.WalletUserException;



public interface WalletUserService {
	
	boolean addAccount(WalletUser walletuser);
	List<WalletUser> getAllWalletUser();
	
	WalletUser saveUser(WalletUser user);

}
