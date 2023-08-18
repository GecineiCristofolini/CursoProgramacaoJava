package model.entities;

import model.entities.exceptions.BusinessException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withrawLimit;
	public Account() {
		
	}
	public Account(Integer number, String holder, Double balance, Double withrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withrawLimit = withrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithrawLimit() {
		return withrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	
	private void validateWithdraw(double amount) {
		if (amount > getWithrawLimit()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
		} 
		if (amount > getBalance()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente");
		}
	}
	
}
