package com.capgemini.EWallet.controller;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.EWallet.entity.WalletUser;
import com.capgemini.EWallet.service.WalletUserService;

@Controller
public class WalletUserController {

	@Autowired
	WalletUserService walletuserservice;

	
	
	@PostMapping("/saveUser")
	public WalletUser saveUser(@RequestBody WalletUser user) {
		return walletuserservice.saveUser(user);
	}

}
