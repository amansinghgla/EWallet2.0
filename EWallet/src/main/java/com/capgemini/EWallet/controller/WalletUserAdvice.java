package com.capgemini.EWallet.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.capgemini.EWallet.exception.WalletUserException;
import com.capgemini.EWallet.dto.ErrorInfo;

@RestControllerAdvice
public class WalletUserAdvice {
	@ExceptionHandler(value = {WalletUserException.class})

	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	
	public ErrorInfo handleException1(Exception ex) {
		return new ErrorInfo(ex.getMessage());
	}
}

	
	
	

