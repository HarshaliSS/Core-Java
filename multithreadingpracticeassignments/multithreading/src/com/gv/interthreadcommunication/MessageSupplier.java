package com.gv.interthreadcommunication;

public class MessageSupplier implements Runnable {

	private MessagePrint print;

	public MessageSupplier(MessagePrint print) {
		super();
		this.print = print;
	}

	public void set() {
		String[] names = { "harshali", "rahul", "sagar", "anushka", "harish","0"};
		for (String name : names)
			print.setMsg(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		set();
	}

}
