package com.test.java.aop;

public interface Memo {
	//�޸� ����
	void memo_add(String memo);
	
	//�޸� �б�
	String memo_read(String seq) throws Exception;
	
	//�޸� ����
	boolean edit(String seq, String memo);
	
	//�޸� ����
	boolean del(String seq);
}
