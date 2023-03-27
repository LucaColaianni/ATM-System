package com.example.atm;

import java.util.Scanner;

public class ATM {
	
	private double balance;
	private double depositAmount;
	private double withdrawAmount;
	
	//costruttore
	
	public ATM() {

	}
	
	//getter & setter
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
	public void versamento() {
		System.out.println("Immetti la quantità da versare: ");
		Scanner scan = new Scanner(System.in);
		double versamento = scan.nextDouble();
		setBalance(this.balance + versamento);
	}
	
	public void prelievo() {
		System.out.println("Inserisci la quantità di prelievo");
		Scanner scan = new Scanner(System.in);
		double prelievo = scan.nextDouble();
		setBalance(this.balance - prelievo);

	}
	
}
