package com.lms.constants.service;

import com.lms.model.BookItem;
import com.lms.model.Member;

public interface LibraryOperationService {	
	
	boolean checkoutBookItem(BookItem bookItem, String memberId);
	
	public void returnBookItem(BookItem bookItem, String memberId);
	
	boolean renewBookItem(BookItem bookItem, String memberId);

}
