package com.CurrencyConverter;

public class CurrencyConverter {
	String currencyName;
	int currencyVal;
	public static void main(String[] args) {
		//Assignment 1 creating few variables and printing them
		
		CurrencyConverter c = new CurrencyConverter();
		c.convertRupeeToDollar();
		}
	void convertRupeeToDollar() {
		currencyVal = 3;
		
		int dollarVal =(currencyVal*90);
		System.out.println("$"+ dollarVal);
		
		
	}

}
