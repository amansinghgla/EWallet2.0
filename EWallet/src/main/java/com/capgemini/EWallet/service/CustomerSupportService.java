package com.capgemini.EWallet.service;

import java.util.ArrayList;

import java.util.List;


import org.springframework.stereotype.Service;

import com.capgemini.EWallet.exception.WalletUserException;
import com.capgemini.EWallet.entity.CustomerSupport;

import com.capgemini.EWallet.dao.CustomerSupportDao;



public interface CustomerSupportService {
	
	boolean addIssue(CustomerSupport customersupport);
	List<CustomerSupport> getAllIssue();
	
	CustomerSupport saveIssue(CustomerSupport customersupport);

}
	
	
	
	


