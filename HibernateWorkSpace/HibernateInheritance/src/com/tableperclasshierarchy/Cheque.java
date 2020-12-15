package com.tableperclasshierarchy;

public class Cheque extends Payment {
	private String chequeType;

	/**
	 * @return the chequeType
	 */
	public String getChequeType() {
		return chequeType;
	}

	/**
	 * @param chequeType the chequeType to set
	 */
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
}
