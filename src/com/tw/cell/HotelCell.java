package com.tw.cell;

public class HotelCell implements CellInterface {

	private CellType cellType = CellType.HOTEL;
	private int cellNumber = 0;
	private int cellCharges = 0;
	private boolean canBuy; 
	@Override
	public CellType getCellType() {
		return cellType;
	}

	@Override
	public int getCellNumber() {
		return cellNumber;
	}

	@Override
	public void setCellNumber(int cellNumber) {
		this.cellNumber=cellNumber;
	}

	@Override
	public void setCellCharges(int cellCharges) {
		this.cellCharges=cellCharges;
	}

	@Override
	public int getCellCahrges(int cellNumber) {
		return this.cellCharges;
	}

	@Override
	public String toString() {
		return "HotelCell [cellType=" + cellType + ", cellNumber=" + cellNumber + ", cellCharges=" + cellCharges
				+ "]";
	}

	@Override
	public boolean canBuy() {
		return canBuy;
	}
	
	public void setCanBuy(boolean canBuy)
	{
		canBuy=canBuy;
	}
}
