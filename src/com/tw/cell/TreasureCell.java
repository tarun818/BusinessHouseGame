package com.tw.cell;

public class TreasureCell implements CellInterface{
	
	private CellType cellType = CellType.TREASURE;
	private int cellNumber = 0;
	private int cellCharges = 0;

	@Override
	public int getCellNumber() {
		return this.cellNumber;
	}

	@Override
	public void setCellNumber(int cellNumber) {
		 this.cellNumber=cellNumber;
	}

	@Override
	public int getCellCahrges(int cellNumber) {
		return this.cellCharges;
	}

	@Override
	public CellType getCellType() {
		return this.cellType;
	}

	@Override
	public void setCellCharges(int cellCharges) {
		this.cellCharges=cellCharges;
	}

	@Override
	public String toString() {
		return "TreasureCell [cellType=" + cellType + ", cellNumber=" + cellNumber + ", cellCharges=" + cellCharges
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
