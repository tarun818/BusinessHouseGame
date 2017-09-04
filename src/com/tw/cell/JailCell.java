package com.tw.cell;

public class JailCell implements CellInterface {
	private CellType cellType = CellType.JAIL;
	private int cellNumber = 0;
	private int cellCharges = 0;


	@Override
	public int getCellNumber() {
		return cellNumber;
	}

	@Override
	public void setCellNumber(int cellNumber) {
		this.cellNumber = cellNumber;
	}

	@Override
	public int getCellCahrges(int cellNumber) {
		return this.cellNumber;
	}

	public CellType getCellType() {
		return cellType;
	}

	public void setCellType(CellType cellType) {
		this.cellType = cellType;
	}

	public int getCellCharges() {
		return cellCharges;
	}

	public void setCellCharges(int cellCharges) {
		this.cellCharges = cellCharges;
	}
	@Override
	public String toString() {
		return "JailCell [cellType=" + cellType + ", cellNumber=" + cellNumber + ", cellCharges=" + cellCharges
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
