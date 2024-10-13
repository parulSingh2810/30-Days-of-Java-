package com.accenture.com;

import java.awt.List;
import java.time.Year;
import java.util.ArrayList;
import java.util.Map;

public class TransactinService {
	
public  void printallTransaction(Map<Long, Transaction> transactionId, long senderNumber ){
	 transactionId.forEach((x,y)-> {if(y.getSenderAccountNumber() == senderNumber)
		 System.out.println(y.toString());
	 });
		 
	 
	
	
	
	
	 
 }
}
