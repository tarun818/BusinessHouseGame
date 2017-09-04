package com.tw.hg;

import java.util.ArrayList;
import java.util.List;

import com.tw.cell.CellInterface;
import com.tw.cell.GeneralCell;
import com.tw.cell.HotelCell;
import com.tw.cell.JailCell;
import com.tw.cell.TreasureCell;

public class HouseGame 
{
	private List<CellInterface> cellList;
	private static final int SIZE =45;

	public HouseGame() 
	{
		createHouseGameBoard();
	}
	
	private List<CellInterface> createHouseGameBoard()
	{
		cellList = new ArrayList<>();
		String inputGameSequence[]  = {"E","E","J","H","E","T",
										"J","T","E","E","H","J",
										"T","H","E","E","J","H",
										"E","T","J","T","E","E",
										"H","J","T","H","J","E",
										"E","J","H","E","T","J",
										"T","E","E","H","J","T",
										"E","H","E"};
		
		for(int i=0;i< inputGameSequence.length;i++)
		{
			if(inputGameSequence[i].equals("E"))
			{
				GeneralCell generalCell = new GeneralCell();
				generalCell.setCellNumber(i);
				cellList.add(generalCell);
			}
			if(inputGameSequence[i].equals("J"))
			{
				JailCell jailCell = new JailCell();
				jailCell.setCellNumber(i);
				jailCell.setCellCharges(-150);
				cellList.add(jailCell);
			}
			
			if(inputGameSequence[i].equals("T"))
			{
				TreasureCell treasureCell = new TreasureCell();
				treasureCell.setCellNumber(i);
				treasureCell.setCellCharges(200);
				cellList.add(treasureCell);
			}
			if(inputGameSequence[i].equals("H"))
			{
				HotelCell hotelCell = new HotelCell();
				hotelCell.setCellNumber(i);
				hotelCell.setCellCharges(-50);
				hotelCell.setCanBuy(true);
				cellList.add(hotelCell);
			}
		}
		

		return cellList;
	}

	public List<CellInterface> getCellList() {
		return cellList;
	}

	public void setCellList(List<CellInterface> cellList) {
		this.cellList = cellList;
	}

	
}
