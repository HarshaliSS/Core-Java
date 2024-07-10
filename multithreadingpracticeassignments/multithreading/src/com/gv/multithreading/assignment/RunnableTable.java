package com.gv.multithreading.assignment;

public class RunnableTable implements Runnable{
	 private Table table;
	 private int TableNo;

	
	
	public RunnableTable(Table table, int tableno) {
		table.printTable(tableno);
		this.table = table;
		this.TableNo=TableNo;
	}



	@Override()
	public void run() {
		table.printTable(TableNo);
	}
	
	

}
