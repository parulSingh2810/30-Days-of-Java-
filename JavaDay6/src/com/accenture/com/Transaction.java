package com.accenture.com;

public class Transaction {

	private long transactionId;

	private long senderAccountNumber;

	private long recipientAccountNumber;

	private double transactionAmount;

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public long getSenderAccountNumber() {
		return senderAccountNumber;
	}

	public void setSenderAccountNumber(long senderAccountNumber) {
		this.senderAccountNumber = senderAccountNumber;
	}

	public long getRecipientAccountNumber() {
		return recipientAccountNumber;
	}

	public void setRecipientAccountNumber(long recipientAccountNumber) {
		this.recipientAccountNumber = recipientAccountNumber;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Transaction(long transactionId, long senderAccountNumber, long recipientAccountNumber,
			double transactionAmount) {
		super();
		this.transactionId = transactionId;
		this.senderAccountNumber = senderAccountNumber;
		this.recipientAccountNumber = recipientAccountNumber;
		this.transactionAmount = transactionAmount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", senderAccountNumber=" + senderAccountNumber
				+ ", recipientAccountNumber=" + recipientAccountNumber + ", transactionAmount=" + transactionAmount
				+ "]";
	}

}
