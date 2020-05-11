package com.capgemini.EWallet.entity;


import javax.persistence.*;
import javax.persistence.Column;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="customersupport")

@DynamicUpdate(true)
@DynamicInsert(true)

public class CustomerSupport {
	
	@NotNull(message="it can not be null")
	@Id
	@Column(name="cust_user_id")
	private Integer CustomerUserId;
	
	@NotEmpty(message="User Name is Mandatory")
	@Size(min=3,max=25,message="Length can be betwwen 3 and 25 chars")
	@Column(name="cust_user_name" ,length=25)
	private String CustomerUserName;
	

	@NotEmpty(message="Phone no can not be empty")
	@Pattern(regexp="(^$|[0-9]{10})")
	@Column(name="cust_phone_number")
	private String CustomerPhoneNumber;
	
	@NotEmpty(message="Issue can not be empty")
	@Size(min=3,max=1000,message="Issue can be explained  betwwen 3 and 25 chars")
	@Column(name="cust_issue")
	private String  CustomerIssue;
	
	@NotNull
	@Column(name="dateof_issue")
	@JsonFormat(pattern="yyyy-mm-dd HH:mm:ss", timezone="India")
	private LocalDateTime DateOfIssue;

	public Integer getCustomerUserId() {
		return CustomerUserId;
	}

	public void setCustomerUserId(Integer customerUserId) {
		CustomerUserId = customerUserId;
	}

	public String getCustomerUserName() {
		return CustomerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		CustomerUserName = customerUserName;
	}

	public String getCustomerPhoneNumber() {
		return CustomerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		CustomerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerIssue() {
		return CustomerIssue;
	}

	public void setCustomerIssue(String customerIssue) {
		CustomerIssue = customerIssue;
	}

	public LocalDateTime getDateOfIssue() {
		return DateOfIssue;
	}

	public void setDateOfIssue(LocalDateTime dateOfIssue) {
		DateOfIssue = dateOfIssue;
	}

	public CustomerSupport(@NotNull(message = "it can not be null") Integer customerUserId,
			@NotEmpty(message = "User Name is Mandatory") @Size(min = 3, max = 25, message = "Length can be betwwen 3 and 25 chars") String customerUserName,
			@NotEmpty(message = "Phone no can not be empty") @Pattern(regexp = "(^$|[0-9]{10})") String customerPhoneNumber,
			@NotEmpty(message = "Issue can not be empty") @Size(min = 3, max = 1000, message = "Issue can be explained  betwwen 3 and 25 chars") String customerIssue,
			@NotNull LocalDateTime dateOfIssue) {
		super();
		CustomerUserId = customerUserId;
		CustomerUserName = customerUserName;
		CustomerPhoneNumber = customerPhoneNumber;
		CustomerIssue = customerIssue;
		DateOfIssue = dateOfIssue;
	}
	

	public CustomerSupport() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerSupport [CustomerUserId=" + CustomerUserId + ", CustomerUserName=" + CustomerUserName
				+ ", CustomerPhoneNumber=" + CustomerPhoneNumber + ", CustomerIssue=" + CustomerIssue + ", DateOfIssue="
				+ DateOfIssue + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	