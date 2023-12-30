package com.lms.constants.service.impl;

import com.lms.constants.service.LibrarianService;
import com.lms.model.BookItem;
import com.lms.model.Member;

public class LibrarianServiceImpl implements LibrarianService {

	@Override
	public boolean addBookItem(BookItem bookItem) {
		//bookItemRepository.save(bookItem)
		return false;
	}

	@Override
	public boolean blockMember(Member member) {
		//update account to inactive
		return true;
	}

	@Override
	public boolean unBlockMember(Member member) {
		//update account to ACTIVE
		return true;
	}

}
