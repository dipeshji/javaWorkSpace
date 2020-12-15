package com.tablepersubclasshierarchy;

public class CreditCard extends Payment {
	private String creditCardType;

	/**
	 * @return the creditCardType
	 */
	public String getCreditCardType() {
		return creditCardType;
	}

	/**
	 * @param creditCardType the creditCardType to set
	 */
	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
}
