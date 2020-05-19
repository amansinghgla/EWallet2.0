package com.capgemini.EWallet.controller;

import java.util.List;


import java.lang.String;


import javax.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





import com.capgemini.EWallet.exception.*;
import com.capgemini.EWallet.exception.WalletUserException;
import com.capgemini.EWallet.dto.Login;
import com.capgemini.EWallet.entity.WalletUser;
import com.capgemini.EWallet.service.WalletUserService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class WalletUserController {

	@Autowired
	private WalletUserService walletuserservice;
	
	
	
	

	
	@GetMapping("/viewall")
	public ResponseEntity<List<WalletUser>> getAllUser(){
		List<WalletUser> accountList= walletuserservice.getAllWalletUser();
		return new ResponseEntity<List<WalletUser>>(accountList,HttpStatus.OK);
	}
	
	
	
	@CrossOrigin(origins="http://localhost:4200")
		@PostMapping("/add")
		public ResponseEntity<String> addAccount(@Valid @RequestBody WalletUser walletuser, BindingResult br) throws WalletUserException
		{
			String err="";
			if(br.hasErrors()) {
				List<FieldError> errors= br.getFieldErrors();
				for(FieldError error:errors)
					err +=error.getDefaultMessage() +"<br/>";
				throw new WalletUserException(err);
			}
			try {
				walletuserservice.addAccount(walletuser);
				return new ResponseEntity<String>("New WalletUser added", HttpStatus.OK);
				
			}
			catch(DataIntegrityViolationException ex) {
				throw new WalletUserException("ID already exists");
			}
		}
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/validateUser")
	public ResponseEntity<WalletUser> validateUser(@RequestBody Login userLogin) throws RecordNotFoundException {
		
		WalletUser b=walletuserservice.validateUser(userLogin.getUserId(), userLogin.getPassword());	
	if(b==null)
		 throw new RecordNotFoundException("Please Enter Valid Login Details UserId/n if you don't have an account please register below");
	else
	 {
	 ResponseEntity<WalletUser> responseEntity = new ResponseEntity<WalletUser>(b, HttpStatus.OK); 
	 return	  responseEntity;
	 }
	 }
	//return b;

	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String>IdNotFoundException(RecordNotFoundException e){
	return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);

	}
	}


	
	
	

