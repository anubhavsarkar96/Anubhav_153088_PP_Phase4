package com.cg.walletApp.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.walletApp.beans.Customer;
import com.cg.walletApp.beans.Transactions;
import com.cg.walletApp.exception.CustomerDetailsNotFoundException;
import com.cg.walletApp.exception.InsufficientBalanceException;
import com.cg.walletApp.exception.InvalidInputException;

public interface WalletService {
	//pass readymade customer object
	public Customer createAccount(Customer customer) throws InvalidInputException;
	
	public Customer showBalance (String mobileNo) throws InvalidInputException,CustomerDetailsNotFoundException;
	
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount) throws InvalidInputException, InsufficientBalanceException, CustomerDetailsNotFoundException;
	
	public Customer depositAmount (String mobileNo,BigDecimal amount ) throws InvalidInputException,CustomerDetailsNotFoundException;
	
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) throws InvalidInputException, InsufficientBalanceException,CustomerDetailsNotFoundException;

	public List<Transactions> getAllTransactions(String mobileNo) throws InvalidInputException,CustomerDetailsNotFoundException;

	public List<Customer> getCustomers()throws InvalidInputException,InsufficientBalanceException,CustomerDetailsNotFoundException;
	
	public List<Customer> getAllCustomers()throws InvalidInputException,InsufficientBalanceException,CustomerDetailsNotFoundException;
}
