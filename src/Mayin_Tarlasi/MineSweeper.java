package Mayin_Tarlasi;

import java.util.Scanner;

public class MineSweeper {

	Scanner scanner = new Scanner(System.in);

	int rowNumber, colNumber;
	int userRow, userCol;
	int numberOfMines;
	String[][] gameMap;
	String[][] mineMap;
	int mineControl;

	public MineSweeper(int rowNumber, int colNumber) {
		super();
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.numberOfMines = (rowNumber * colNumber) / 4;
		this.gameMap = new String[rowNumber][colNumber];
		this.mineMap = new String[rowNumber][colNumber];
		this.mineControl = 0;
	}

	public void createMap() { // harita oluþturmak
		System.out.println("**********MAYIN TARLASI OLUÞTURULAN MAYINSIZ HARÝTA**********");
		for (int i = 0; i < this.rowNumber; i++) {
			for (int j = 0; j < this.colNumber; j++) {
				gameMap[i][j] = "-";
				mineMap[i][j] = "-";
				System.out.print(gameMap[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void createMineMap() {
		System.out.println("**********MAYIN TARLASI OLUÞTURULAN MAYIN HARÝTASI**********");
		for (int i = 0; i < numberOfMines; i++) {
			int a = (int) (Math.random() * this.rowNumber);
			int b = (int) (Math.random() * this.colNumber);
			if (mineMap[a][b].equals("*")) {
				i--;
			}
			mineMap[a][b] = "*";
		}
		for (int i = 0; i < this.rowNumber; i++) {
			for (int j = 0; j < this.colNumber; j++) {
				System.out.print(mineMap[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void satirSutunGirisi() {
		System.out.println("********");
		System.out.println("Satýr: ");
		this.userRow = scanner.nextInt();
		System.out.println("Sütun: ");
		this.userCol = scanner.nextInt();
		if (!(0 <= userRow && 0 <= userCol && userRow <= this.rowNumber && userCol <= this.colNumber)) {
			System.out.println("Sýnýrlar dýþýnda giriþ. Tekrar Deneyiniz");
			satirSutunGirisi();
		}

	}

	public void countMine() {
		int counter = 0;
		for (int i = (this.userRow - 1); i <= this.userRow + 1; i++) {
			for (int j = (this.userCol * 1); j <= this.userCol + 1; j++) {
				if (i < 0 || j < 0 || i >= this.rowNumber || j >= this.colNumber) {
					continue;
				} else {
					if (mineMap[i][j].equals("*")) {
						counter++;
					}
				}
			}
		}

		gameMap[this.userRow][this.userCol] = String.valueOf(counter);

		for (int i = 0; i < this.rowNumber; i++) {
			for (int j = 0; j < this.colNumber; j++) {
				System.out.print(gameMap[i][j] + " ");
			}
			System.out.println();
		}

	}

	public boolean checkIfGameWon() {
		for (int i = 0; i < this.rowNumber; i++) {
			for (int j = 0; j < this.colNumber; j++) {
				if (mineMap[i][j].equals("-")) {
					return false;
				}
			}
		}
		return true;
	}

	public void run() {
		boolean check = true;
		createMap();
		createMineMap();
		satirSutunGirisi();

		while (check) {
			if (mineMap[this.userRow][this.userCol].equals("*")) {
				System.out.println("Kaybettin!");
				check = false;
			} else if (checkIfGameWon()) {
				System.out.println("Tebrikler!");
				check = false;
			
			}else {
				countMine();
				satirSutunGirisi();
				check = true;
			}

		}
	}
}
