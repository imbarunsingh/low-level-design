package com.lms.constants.service.impl;



import com.lms.constants.service.LibraryOperationService;
import com.lms.model.BookItem;
import com.lms.model.Member;

public class LibraryOperationServiceImpl implements LibraryOperationService {

	
	@Override
	public boolean checkoutBookItem(BookItem bookItem, String memberId) {
		//check if the book is already reserved by someone
		//if not , then create an entry in book reservation table and update the book status to reserved
		return false;
	}


	@Override
	public void returnBookItem(BookItem bookItem, String memberId) {
		// TODO Auto-generated method stub
				
		
	}


	@Override
	public boolean renewBookItem(BookItem bookItem, String memberId) {
		// TODO Auto-generated method stub
		//check if the book is already reserved by someone
		//if not , then create an entry in book reservation table and update the book status to reserved
		return false;
	}
	
	private int getTotalBooksCheckedout(String memberId) {
		return -1;
	}

	private void incrementTotalBooksCheckedout(Member member) {

	}

	private int checkForFine(String bookItemBarcode) {
		// check for fine and return the fine
		return 1;
	}


}
