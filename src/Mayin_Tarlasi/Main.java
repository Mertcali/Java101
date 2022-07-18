
package Mayin_Tarlasi;

public class Main {

	public static void main(String[] args) {
		
		MineSweeper mineSweeper = new MineSweeper(4,3);
		//mineSweeper.createMap(); // oluþturulan haritayý test etmek amaçlý
		//mineSweeper.createMineMap(); // oluþturulan mine haritasý test
		//mineSweeper.satirSutunGirisi();//satir sutun girisi test
		//mineSweeper.countMine();
		mineSweeper.run();

	}

}
