package com.tw.cell;

public interface CellInterface {
	
	CellType getCellType();
	int getCellNumber();
	void setCellNumber(int cellNumber);
	
	void setCellCharges(int cellCharges);
	int getCellCahrges(int cellNumber);
	boolean canBuy();
	public void setCanBuy(boolean canBuy);
	
}
