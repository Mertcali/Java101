
package Mayin_Tarlasi;

public class Main {

	public static void main(String[] args) {
		
		MineSweeper mineSweeper = new MineSweeper(4,3);
		//mineSweeper.createMap(); // olu�turulan haritay� test etmek ama�l�
		//mineSweeper.createMineMap(); // olu�turulan mine haritas� test
		//mineSweeper.satirSutunGirisi();//satir sutun girisi test
		//mineSweeper.countMine();
		mineSweeper.run();

	}

}
