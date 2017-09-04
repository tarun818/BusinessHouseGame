package com.tw.participent;

import java.util.ArrayList;
import java.util.List;

import com.tw.cell.CellInterface;

public class Player {
	private String name;
	private long amount=1000;
	private List<CellInterface> propertyList = new ArrayList<>();
	private int currentCellNumber=0;
	private boolean isWinner=false;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public List<CellInterface> getPropertyList() {
		return propertyList;
	}
	public void setPropertyList(List<CellInterface> propertyList) {
		this.propertyList = propertyList;
	}
	public int getCurrentCellNumber() {
		return currentCellNumber;
	}
	public void setCurrentCellNumber(int currentCellNumber) {
		this.currentCellNumber = currentCellNumber;
	}
	public boolean isWinner() {
		return isWinner;
	}
	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", amount=" + amount + ", propertyList=" + propertyList + ", currentCellNumber="
				+ currentCellNumber + ", isWinner=" + isWinner + "]";
	}
	
	
	

}
