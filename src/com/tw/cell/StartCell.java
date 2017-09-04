package com.tw.cell;

public class StartCell implements CellInterface{

	private CellType cellType = CellType.STARTPOINT;
	private int cellNumber = 0;
	private int cellCharges = 0;
	@Override
	public CellType getCellType() {
		return cellType;
	}

	@Override
	public int getCellNumber() {
		return 0;
	}

	@Override
	public void setCellNumber(int cellNumber) {
	}

	@Override
	public void setCellCharges(int cellCharges) {
	}

	@Override
	public int getCellCahrges(int cellNumber) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "StartCell [cellType=" + cellType + ", cellNumber=" + cellNumber + ", cellCharges=" + cellCharges
				+ "]";
	}

	@Override
	public boolean canBuy() {
		return false;
	}

	@Override
	public void setCanBuy(boolean canBuy) {
		
	}

}
