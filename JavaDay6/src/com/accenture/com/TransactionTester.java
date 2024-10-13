package com.accenture.com;

import java.util.HashMap;

public class TransactionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction obj1 = new Transaction(1001l, 234242, 234243, 789.00);
		Transaction obj3 = new Transaction(1002l, 234243242, 22334243, 73489.00);
		Transaction obj2 = new Transaction(1003l, 233244242, 234243435, 7389.00);
		HashMap<Long, Transaction>  hs = new HashMap<>();
		hs.put( 234242l,obj1);
		hs.put(233244242l, obj2);
		hs.put(234243242l, obj3);
		TransactinService service = new TransactinService();
		
		
		service.printallTransaction(hs,234242);
		
		
		
		
	
		
		

	}

}
