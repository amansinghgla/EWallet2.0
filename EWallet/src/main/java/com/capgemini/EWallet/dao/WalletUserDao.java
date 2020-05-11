package com.capgemini.EWallet.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;



import com.capgemini.EWallet.entity.WalletUser;




public interface WalletUserDao extends JpaRepository<WalletUser, Integer>  {
	



}
