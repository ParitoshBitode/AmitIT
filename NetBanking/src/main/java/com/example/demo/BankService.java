package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankService {

	@GetMapping("bank/deposite/{accNo}/{amt}/{sign}")
	String deposite(int accNo, int amt, String sign)
	{
		return "Deposite Successfully";
	}
	
	String withdraw(int accNo, int amt, int pin)
	{
		return "Withdraw Successfully";
	}
	
	int checkBalance(int accNo, int pin)
	{
		return 2500;
	}
	
	String openAccount(String name, String add, String adhar, int mobNo, String email, int age)
	{
		return "Account is Created Successfully";
	}
	
}
