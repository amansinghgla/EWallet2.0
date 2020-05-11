package com.capgemini.EWallet.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.capgemini.EWallet.entity.CustomerSupport;
import com.capgemini.EWallet.dao.CustomerSupportDao;



@Service
@Transactional
public class CustomerSupportService {
	private final CustomerSupportDao customersupportdao;
	
	public CustomerSupportService(CustomerSupportDao customersupportdao) {
		this.customersupportdao=customersupportdao;
	}
	
	public void saveMyCustomerSupport(CustomerSupport customersupport) {
		customersupportdao.save(customersupport);
	}
	
	public List<CustomerSupport> showAllIssues(){
		List<CustomerSupport> issues = new ArrayList<CustomerSupport>();
		for(CustomerSupport customersupport : customersupportdao.findAll()) {
			issues.add(customersupport);
		}
		
		return issues;
	}
	
	
	
	
	
	

}
