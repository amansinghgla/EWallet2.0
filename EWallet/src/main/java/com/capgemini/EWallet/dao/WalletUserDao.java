package com.capgemini.EWallet.dao;

import java.util.List;






import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.EWallet.entity.WalletUser;




public interface WalletUserDao extends JpaRepository<WalletUser, Integer>  {

	
	@Query("select d from WalletUser d  where user_id =?1 and user_password=?2")
	WalletUser LoginDetails(Integer userId, String password);
	


}
  




