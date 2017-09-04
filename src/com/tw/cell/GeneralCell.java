package com.tw.cell;

public class GeneralCell implements CellInterface{

	private CellType cellType = CellType.EMPTYCELL;

	private int cellNumber = 0;
	private int cellCharges = 0;
	
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
	}

	@Override
	public int getCellCahrges(int cellNumber) {
		return 0;
	}

	@Override
	public String toString() {
		return "EmptyCell [cellType=" + cellType + ", cellNumber=" + cellNumber + ", cellCharges=" + cellCharges
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
