package com.test.java.aop;

public class MemoImpl implements Memo {

	@Override
	public void memo_add(String memo) {
		System.out.println("�޸� ����: " + memo);
	}

	@Override
	public String memo_read(String seq) throws Exception {
		if (seq.equals("1")) return "�ȳ��ϼ���";
		else if (seq.equals("2")) return "ȫ�浿�Դϴ�.";
		else if (seq.equals("3")) return "�޸� �׽�Ʈ";
		else throw new Exception("�������� �ʴ� �޸�");
	}

	@Override
	public boolean edit(String seq, String memo) {
		System.out.println("�޸� ����: " + memo);
		return true;
	}

	@Override
	public boolean del(String seq) {
		System.out.println("�޸� ����: " + seq);
		return true;
	}
	
}
