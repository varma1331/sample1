package org.bank;

public class BankInfo extends AxisBank{
	public void saving() {
		System.out.println("SAVINS");
	}
	public void fixed() {
		System.out.println("FIXED");
	}
	public static void main(String[] args) {
		BankInfo BI = new BankInfo();
		BI.saving();
		BI.fixed();
		BI.deposit();
		
	}
}
