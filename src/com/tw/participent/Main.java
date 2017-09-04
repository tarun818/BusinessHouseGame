package com.tw.participent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tw.cell.CellInterface;
import com.tw.cell.CellType;
import com.tw.dice.Dice;
import com.tw.hg.HouseGame;

public class Main {

	public static void main(String[] args) {
		HouseGame hGame = new HouseGame();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("Printing Current House Game Board Structure");
		//Total 45 Element
		System.out.println(hGame.getCellList().toString());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		List<Player> playersList = getPlayerInput();

		for(int i=1;i<=playersList.size();i++)
		{
			//get predetermined dice value for just sake of testing known behavior ,We can change it into Random.next int next time
			int diceValue = Dice.getRandomNumber();
			if(diceValue==-1)
				break;
			System.out.println("--------------------------------------------------------------------------------------------------------------");
			System.out.println("Player "+i+" turn");
			System.out.println("Player "+i+" roled and dice value is:"+ diceValue);
			Player currentPlayer = null;
			currentPlayer = playersList.get(i-1);
			int currentCellNumber= currentPlayer.getCurrentCellNumber()+diceValue;
			//Business house board completed,restarting from starting point.
			if(currentCellNumber>=45)
			{
				currentCellNumber=(45-currentCellNumber)+diceValue;
			}
			CellInterface curentPostionofPayerInBoardList = hGame.getCellList().get(currentCellNumber);
			System.out.println(curentPostionofPayerInBoardList.toString());
			currentPlayer.setCurrentCellNumber(currentCellNumber);
			if(curentPostionofPayerInBoardList.getCellType().equals(CellType.EMPTYCELL))
			{
				System.out.println("In Empty cell "+curentPostionofPayerInBoardList.getCellNumber());
				currentPlayer.setCurrentCellNumber(currentCellNumber);
				curentPostionofPayerInBoardList = hGame.getCellList().get(currentPlayer.getCurrentCellNumber());
			}
			else if(curentPostionofPayerInBoardList.getCellType().equals(CellType.JAIL))
			{
				System.out.println("In Jail cell "+curentPostionofPayerInBoardList.getCellNumber());
				currentPlayer.setAmount(currentPlayer.getAmount()+curentPostionofPayerInBoardList.getCellCahrges(currentCellNumber));
			}
			else if(curentPostionofPayerInBoardList.getCellType().equals(CellType.TREASURE))
			{
				System.out.println("In Tressure cell "+curentPostionofPayerInBoardList.getCellNumber());
				currentPlayer.setAmount(currentPlayer.getAmount()+curentPostionofPayerInBoardList.getCellCahrges(currentCellNumber));
			}
			else if(curentPostionofPayerInBoardList.getCellType().equals(CellType.HOTEL))
			{
				System.out.println("In Hote cell "+curentPostionofPayerInBoardList.getCellNumber());
				if(curentPostionofPayerInBoardList.canBuy())
				{
					//Buying hotel for investment purposes
					System.out.println("buying hotel "+curentPostionofPayerInBoardList.getCellNumber());
					long amount = currentPlayer.getAmount();
					currentPlayer.setAmount(amount-200);
					
					currentPlayer.getPropertyList().add(curentPostionofPayerInBoardList);
					curentPostionofPayerInBoardList.setCanBuy(false);
				}
				else
				{
					//Some other player owned this hotel cell, so paying rent 
					System.out.println("Paying hotel rent ");
					long amount = currentPlayer.getAmount();
					currentPlayer.setAmount(amount+curentPostionofPayerInBoardList.getCellCahrges(currentCellNumber));
					addRentToHotelOwner(playersList,curentPostionofPayerInBoardList);
				}
			}
			printPayerFinalStatus(playersList);
			if(i==3)
			{
				i=0;
			}
		}
	}
	
	private static void printPayerFinalStatus(List<Player> playersList)
	{
		for(Player p : playersList)
		{
			System.out.println("Name="+p.getName() + " Amount= "+p.getAmount()+" Cureent Cell No:"+p.getCurrentCellNumber());
		}
	}

	public static void addRentToHotelOwner(List<Player> playersList, CellInterface curentPostionofPayerInBoardList)
	{
		for(Player p : playersList)
		{
			if(p.getPropertyList().contains(curentPostionofPayerInBoardList))
			{
				long amount = p.getAmount();
				p.setAmount(amount+50);
			}
		}
		
	}
	
	public static List<Player> getPlayerInput()
	{
		List<Player> playersList = new ArrayList<>();
		Scanner inScanner = new Scanner(System.in);
		int totalNumberPlayer = 0;

		System.out.println("Please enter number of Player in integer : ");
		totalNumberPlayer = inScanner.nextInt();

		for (int i = 0; i < totalNumberPlayer; i++) {
			System.out.println("Please enter Player" + i + " name :");
			String name = inScanner.next();
			Player p = new Player();
			p.setName(name);

			playersList.add(p);
			System.out.println("Player added with these attribute,Deafult amount is 1000 :" + p.toString());
		}
		return playersList;
	}

}
