package com.test.java.aop;

public interface Memo {
	//메모 쓰기
	void memo_add(String memo);
	
	//메모 읽기
	String memo_read(String seq) throws Exception;
	
	//메모 수정
	boolean edit(String seq, String memo);
	
	//메모 삭제
	boolean del(String seq);
}
