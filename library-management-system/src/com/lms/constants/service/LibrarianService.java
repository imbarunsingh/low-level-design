package com.lms.constants.service;

import com.lms.model.BookItem;
import com.lms.model.Member;

public interface LibrarianService {
	
	boolean addBookItem(BookItem bookItem);
	boolean blockMember(Member member);
	boolean unBlockMember(Member member);
}
