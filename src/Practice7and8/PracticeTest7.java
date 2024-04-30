package jp.co.aforce.test.Practice7and8;

public class PracticeTest7 {

	public static void main(String[] args) {
		
		//練習問題１
		
	Airplane airplane = new Airplane();
	Fighter fighter = new Fighter();
	
	
	//練習問題2
	airplane.liFly();
	fighter.liFly();
	fighter.liFight();
	
	System.out.println(airplane.liFly());
	System.out.println(fighter.liFly());
	System.out.println(fighter.liFight());
	}

}
